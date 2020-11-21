package pers.pudge.spark.practices.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HbaseUtil {

	/**
	 * 测试hbase的数据库的连接
	 * @param config
	 * @return
	 */
	public static boolean testConnect(String config) throws Exception{
		if (StringUtils.isBlank(config)) {
			return false;
		}
		JSONObject jsonObject = (JSONObject) JSON.parse(config);
		Configuration conf = HBaseConfiguration.create();
		jsonObject.forEach((k, v) -> {
			conf.set(k, jsonObject.getString(k));
		});
		conf.set("hbase.client.pause","100");
		conf.set("zookeeper.recovery.retry.intervalmill", "200");//zk重试的休眠时间
		conf.set("hbase.client.retries.number", "3");//重试次数

        //#todo hbase kerberos认证暂时没有
		Connection connection=null;
		try {
			connection= ConnectionFactory.createConnection(conf);
			HBaseAdmin admin = (HBaseAdmin) connection.getAdmin();
			TableName[] tableNames = admin.listTableNames();
			if(tableNames!=null&&tableNames.length>0){
				return true;
			}
		}finally {
			if (connection != null) {
				connection.close();
			}
		}
		return  false;

	}

	public static List<Map> getTableNames(String config) throws Exception {
		List<Map> list = new ArrayList<>();

		if (StringUtils.isBlank(config)) {
			return list;
		}
		Connection connection = null;
		try {

			connection = getConnection(config);
			HBaseAdmin admin = (HBaseAdmin) connection.getAdmin();
			TableName[] tableNames = admin.listTableNames();
			for (TableName tableName : tableNames) {
				Map<String, String> map = new HashMap<>();
				map.put("name", tableName.getNameAsString());
				list.add(map);
			}
			return list;
		} finally {
			if (connection != null) {
				connection.close();

			}
		}
	}

	public static String txt2String(File file) {
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
			String s = null;
			while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
				result.append(System.lineSeparator() + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}


	public static byte[] getDataByKey(String clusterconf, String tableName, String rk, String cf, String col) throws IOException {
		JSONObject jsonObject = (JSONObject) JSON.parse(clusterconf);
		Configuration hbaseconf = new Configuration(false);
		hbaseconf.clear();
		jsonObject.forEach((k, v) -> {
			hbaseconf.set(k, jsonObject.getString(k));
		});

		Connection connection = null;
		Table table = null;

		try {
			connection = ConnectionFactory.createConnection(hbaseconf);
			table = connection.getTable(TableName.valueOf(tableName));
			Get get = new Get(Bytes.toBytes(rk));
			Result result = table.get(get);
			return result.getValue(Bytes.toBytes(cf), Bytes.toBytes(col));
		} finally {
			if (table != null) {
				table.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}


	public static void deleteHtable(String clusterConfStr, String tableName) throws IOException {
		JSONObject jsonObject = (JSONObject) JSON.parse(clusterConfStr);
		Configuration hbaseconf = new Configuration(false);
		hbaseconf.clear();
		jsonObject.forEach((k, v) -> {
			hbaseconf.set(k, jsonObject.getString(k));
		});
		hbaseconf.setBoolean("fs.hdfs.impl.disable.cache", true);

		Connection connection = ConnectionFactory.createConnection(hbaseconf);
		Admin admin = connection.getAdmin();

		admin.deleteTable(TableName.valueOf(tableName));
	}




	public static Connection getConnection(String config) throws IOException {
		JSONObject jsonObject = (JSONObject) JSON.parse(config);
		String quorum = jsonObject.getString("hbase.zookeeper.quorum");
		String clientPort = (String) jsonObject.getOrDefault("hbase.zookeeper.property.clientPort", "2181");
		String zookeeperParent = jsonObject.getString("zookeeper.znode.parent");

		Configuration conf = HBaseConfiguration.create();
		jsonObject.forEach((k, v) -> {
			conf.set(k, jsonObject.getString(k));
		});
		conf.set("hbase.client.retries.number", "3");//重试次数
		conf.set("hbase.zookeeper.quorum", quorum);
		conf.set("hbase.zookeeper.property.clientPort", clientPort);
		if (StringUtils.isNotEmpty(zookeeperParent)) {
			conf.set("zookeeper.znode.parent", zookeeperParent);
		}
		String dAuthType = jsonObject.getString("hadoop.security.authentication");
		if (StringUtils.isNotBlank(dAuthType) && dAuthType.equals("kerberos")) {
			String principal = jsonObject.getString("kerberos.principal");
			String krb5 = jsonObject.getString("kerberos.krb5");
			String keytab = jsonObject.getString("kerberos.keytab");
			System.setProperty("java.security.krb5.conf", krb5);
			conf.set("hadoop.security.authentication", "kerberos");
			conf.set("hadoop.security.authorization", "true");
			UserGroupInformation.setConfiguration(conf);
			UserGroupInformation.loginUserFromKeytab(principal, keytab);
//			UserGroupInformation.reset();

		}
		return ConnectionFactory.createConnection(conf);
	}



}
