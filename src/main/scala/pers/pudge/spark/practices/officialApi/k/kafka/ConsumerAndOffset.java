package pers.pudge.spark.practices.officialApi.k.kafka;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Properties;
import java.util.Scanner;

public class ConsumerAndOffset {

    private static Scanner in;

    public static void main(String[] argv) throws Exception {
//        if (argv.length != 3) {
//            System.err.printf("Usage: %s <topicName> <groupId> <startingOffset>\n",
//                    ConsumerAndOffset.class.getSimpleName());
//            System.exit(-1);
//        }
        in = new Scanner(System.in);

//        String topicName = argv[0];
//        String groupId = argv[1];
//        final long startingOffset = Long.parseLong(argv[2]);
        String topicName = "parti3";
        String groupId = "2";
        final long startingOffset = 40;

        ConsumerThread consumerThread = new ConsumerThread(topicName, groupId, startingOffset);
        consumerThread.start();
        String line = "";
        while (!line.equals("exit")) {
            line = in.next();
        }
        consumerThread.getKafkaConsumer().wakeup();
        System.out.println("Stopping consumer .....");
        consumerThread.join();

    }

    private static class ConsumerThread extends Thread {
        private String topicName;
        private String groupId;
        private long startingOffset;
        private KafkaConsumer<String, String> kafkaConsumer;

        public ConsumerThread(String topicName, String groupId, long startingOffset) {
            this.topicName = topicName;
            this.groupId = groupId;
            this.startingOffset = startingOffset;
        }

        public void run() {
            Properties configProperties = new Properties();
            configProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "dn6:9092,dn7:9092,dn8:9092");
            configProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.ByteArrayDeserializer");
            configProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
            configProperties.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
//            configProperties.put(ConsumerConfig.CLIENT_ID_CONFIG, "offset123");
            configProperties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
            configProperties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

            //Figure out where to start processing messages from
            kafkaConsumer = new KafkaConsumer<String, String>(configProperties);
            kafkaConsumer.subscribe(Arrays.asList(topicName), new ConsumerRebalanceListener() {
                public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
                    System.out.printf("%s topic-partitions are revoked from this consumer\n", Arrays.toString(partitions.toArray()));
                }

                public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
                    System.out.printf("%s topic-partitions are assigned to this consumer\n", Arrays.toString(partitions.toArray()));
//                    Iterator<TopicPartition> topicPartitionIterator = partitions.iterator();

//                    while (topicPartitionIterator.hasNext()) {
//                        TopicPartition topicPartition = topicPartitionIterator.next();
//                        System.out.println("Current offset is " + kafkaConsumer.position(topicPartition) + " committed offset is ->" + kafkaConsumer.committed(topicPartition));

                    if (startingOffset == -2) {
                        System.out.println("Leaving it alone");
                    } else if (startingOffset == 0) {
                        System.out.println("Setting offset to begining");

                        kafkaConsumer.seekToBeginning(partitions);
                    } else if (startingOffset == -1) {
                        System.out.println("Setting it to the end ");

                        kafkaConsumer.seekToEnd(partitions);
                    } else {
                        System.out.println("Resetting offset to " + startingOffset);
                        for (TopicPartition ele : partitions) {
                            kafkaConsumer.seek(ele, startingOffset);
                        }
                    }

//                    }

                }
            });
            //Start processing messages
            try {
                while (true) {
                    ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
                    for (ConsumerRecord<String, String> record : records) {
                        System.out.println(record.value());
                    }
                    if (startingOffset == -2)
                        kafkaConsumer.commitSync();
                }
            } catch (WakeupException ex) {
                System.out.println("Exception caught " + ex.getMessage());
            } finally {
                kafkaConsumer.close();
                System.out.println("After closing KafkaConsumer");
            }
        }

        public KafkaConsumer<String, String> getKafkaConsumer() {
            return this.kafkaConsumer;
        }
    }

}
