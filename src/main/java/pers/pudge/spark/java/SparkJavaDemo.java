package pers.pudge.spark.java;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by pudgebd on 17-4-20.
 */
public class SparkJavaDemo {


    public static void main(String[] args) {
        SparkSession ss = SparkSession.builder()
                .appName("SparkJavaDemo").master("local[4]").getOrCreate();

        JavaRDD<String> javaRDD = ss.read().textFile("src/main/resources/name_age.txt").toJavaRDD();
        JavaRDD<Row> rowRDD = javaRDD.map(str -> {
            String[] attributes = str.split(" ");
            return RowFactory.create(attributes[0], attributes[1].trim());
        });

        List<StructField> fields = new ArrayList<>();
        fields.add(DataTypes.createStructField("name", DataTypes.StringType, true));
        fields.add(DataTypes.createStructField("age", DataTypes.IntegerType, true));

        StructType schema = DataTypes.createStructType(fields);
        Dataset<Row> peopleDF = ss.createDataFrame(rowRDD, schema);

        Map<String, String> map = new ConcurrentHashMap<>();
//        map.put()
//        peopleDF.
    }

}
