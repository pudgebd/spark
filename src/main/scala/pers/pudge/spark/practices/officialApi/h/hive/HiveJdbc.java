package pers.pudge.spark.practices.officialApi.h.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveJdbc {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public static void main(String[] args) throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(
                "jdbc:hive2://172.18.203.113:21050/;auth=noSasl", "", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select count(*) from t_ug_test");

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        stmt.close();
        con.close();
    }

}
