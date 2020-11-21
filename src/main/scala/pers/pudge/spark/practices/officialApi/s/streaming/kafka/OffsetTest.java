package pers.pudge.spark.practices.officialApi.s.streaming.kafka;

import kafka.api.FetchRequestBuilder;
import kafka.api.PartitionOffsetRequestInfo;
import kafka.common.TopicAndPartition;
import kafka.javaapi.*;
import kafka.javaapi.consumer.SimpleConsumer;
import kafka.javaapi.message.ByteBufferMessageSet;
import kafka.message.MessageAndOffset;

import java.nio.ByteBuffer;
import java.util.*;

/**
 */
public class OffsetTest {

    private static String host = "dn6";
    private static int port = 9092;
    private static int soTimeout = 1000 * 6;
    private static int bufferSize = 512 * 1024;
    private static String clientId = "clientId";
    private static String topic = "mytopic";
    private static int paritionid = 0;

    //构造consumer,这里的host是brokers，在现实环境中broker有很多个，
    // 遍历所有的broker，并获得该broker上的partition，然后获得partition的leader
    private static SimpleConsumer simpleConsumer
            = new SimpleConsumer(host, port, soTimeout, bufferSize, clientId);


    public static void main(String[] args) {
//        readFromOffset1();
        readFromOffset2();
    }

    private static void getLeader() {
        List<String> topics = Collections.singletonList(topic);
        //构造TopicMetadataRequest
        TopicMetadataRequest topicMetadataRequest = new TopicMetadataRequest(topics);

        String leader = "";

        TopicMetadataResponse topicMetadataResponse = simpleConsumer.send(topicMetadataRequest);
        List<TopicMetadata> topicMetadatas = topicMetadataResponse.topicsMetadata();

        for (TopicMetadata topicMetadata : topicMetadatas) {
            List<PartitionMetadata> partitionMetadatas = topicMetadata.partitionsMetadata();

            for (PartitionMetadata partitionMetadata : partitionMetadatas) {
//                if (partitionMetadata.partitionId() == paritionid) {
//                    leader = partitionMetadata.leader().host();
//                }
                System.err.println(partitionMetadata.leader().host());
            }
        }

//        System.out.println(leader);
    }

    private static void readFromOffset1() {
        TopicAndPartition topicAndPartition = new TopicAndPartition(topic, paritionid);
        long whichTime = kafka.api.OffsetRequest.LatestTime();

        PartitionOffsetRequestInfo partitionOffsetRequestInfo =
                new PartitionOffsetRequestInfo(whichTime, 2);

        Map<TopicAndPartition, PartitionOffsetRequestInfo> infoMap
                = new HashMap<TopicAndPartition, PartitionOffsetRequestInfo>();

        infoMap.put(topicAndPartition, partitionOffsetRequestInfo);

        kafka.javaapi.OffsetRequest offsetRequest
                = new kafka.javaapi.OffsetRequest(infoMap, kafka.api.OffsetRequest.CurrentVersion(), clientId);

        OffsetResponse offsetsBefore = simpleConsumer.getOffsetsBefore(offsetRequest);

        long[] arr = offsetsBefore.offsets(topic, paritionid);
        for (Long ele : arr) {
            System.err.println(ele);
        }
//        long readFromOffset1 = arr[0];
//        System.out.println(readFromOffset1);
    }

    private static void readFromOffset2() {
        int fetchSize = 10000;

        kafka.api.FetchRequest fetchRequest = new FetchRequestBuilder()
                .clientId(clientId)
                .addFetch(topic, paritionid, 2, fetchSize)
                .build();

        FetchResponse fetch = simpleConsumer.fetch(fetchRequest);
        ByteBufferMessageSet messageAndOffsets = fetch.messageSet(topic, paritionid);

        Iterator<MessageAndOffset> iterator = messageAndOffsets.iterator();

        while (iterator.hasNext()) {
            MessageAndOffset messageAndOffset = iterator.next();
            ByteBuffer payload = messageAndOffset.message().payload();
            byte[] bytes = new byte[payload.limit()];
            payload.get(bytes);
            System.out.println("OFFSET:" + String.valueOf(messageAndOffset.offset()) + ",MESSAGE: " + new String(bytes));
        }
    }


}
