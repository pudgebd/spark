package pers.pudge.spark.practices.officialApi.a.aerospike;

import com.aerospike.client.*;
import com.aerospike.client.policy.Priority;
import com.aerospike.client.policy.ScanPolicy;

public final class ScanParallelTest implements ScanCallback {
    public static void main(String[] args) {
        try {
            new ScanParallelTest().runTest();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int recordCount;

    public void runTest() throws AerospikeException {
        AerospikeClient client = new AerospikeClient("10.58.11.39", 3000);

        try {
            ScanPolicy policy = new ScanPolicy();
            policy.concurrentNodes = true;
            policy.priority = Priority.LOW;
            policy.includeBinData = false;

            client.scanAll(policy, "ns1", "maps", this);
            System.out.println("Records " + recordCount);
        }
        finally {
            client.close();
        }
    }

    public void scanCallback(Key key, Record record) {
        System.out.println(key.digest.length);
        System.out.println("------------------");
        recordCount++;
        if ((recordCount % 10000) == 0) {
            System.out.println("Records " + recordCount);
        }
    }
}