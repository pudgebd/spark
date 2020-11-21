package pers.pudge.spark.practices.utils.constants;

import org.apache.hadoop.hbase.util.Bytes;

public class ConfigKey {

    public static final String CF = "cf";
    public static final byte[] CF_BYTES = Bytes.toBytes(CF);

    public static final String DC_SQL_JOBSERVER = "dc.sql.jobserver";
    public static final String HBASE_ZOOKEEPER_QUORUM = "hbase.zookeeper.quorum";
    public static final String HBASE_ZOOKEEPER_PROPERTY_CLIENTPORT = "hbase.zookeeper.property.clientPort";
    public static final String HBASE_HREGION_MAX_FILESIZE = "hbase.hregion.max.filesize";
    public static final String HBASE_MAPREDUCE_BULKLOAD_MAX_HFILES_PERREGION_PERFAMILY = "hbase.mapreduce.bulkload.max.hfiles.perRegion.perFamily";

}
