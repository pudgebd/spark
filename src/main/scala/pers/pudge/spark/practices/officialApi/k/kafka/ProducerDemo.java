package pers.pudge.spark.practices.officialApi.k.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import pers.pudge.spark.practices.utils.constants.Key;
import pers.pudge.spark.practices.utils.constants.LocalKafkaCnts;

import java.util.Properties;

public class ProducerDemo {

    public static void main(String[] args) {
        boolean isAsync = args.length == 0 ||
                /* 消息的发送方式：异步发送还是同步发送 */
                !args[0].trim().equalsIgnoreCase("sync");

        Properties props = new Properties();
        props.put("bootstrap.servers", LocalKafkaCnts.BOOTSTRAP_SERVERS());
        /* 客户端的 ID */
        props.put("client.id", "DemoProducer");
        /*
         * 消息的 key 和 value 都是字节数组，为了将 Java 对象转化为字节数组，可以配置
         * "key.serializer" 和 "value.serializer" 两个序列化器，完成转化
         */
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        /* StringSerializer 用来将 String 对象序列化成字节数组 */
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        /* 生产者的核心类 */
        KafkaProducer producer = new KafkaProducer<>(props);

        /* 向指定的 test 这个 topic 发送消息 */
        String topic = Key.MYTOPIC02();

        /* 消息的 key */
        int messageNo = 1;
        while (true) {
            try {
                String messageStr = String.valueOf(messageNo);
                long startTime = System.currentTimeMillis();
                producer.send(new ProducerRecord<>(topic, null, messageStr));
                ++messageNo;
                Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
