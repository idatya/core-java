package com.sh.java6.enumeration;


public class Enum {

    public enum DataStoreType {
        /* CASSANDRA, */HDFS, /* ELASTICSEARCH, NETEZZA, MY_SQL, */TERADATA, FILE_CSV, HIVE, ORACLE, ANY, CLICKSTREAM, SAPHANA, SQLSERVER, NETEZZA, DB2, HBASE, SPARK, RDBMS, MPP, FILESYSTEM, SPARKSQLHIVE, PHOENIXHBASE, BIGDATASTORE, KAFKASTREAM, UFS, MAPRFS, CUSTOMQUERY, FTP, SFTP, REDSHIFT;

        public static DataStoreType value(String type) {

            try {
                    return DataStoreType.valueOf(type);
            } catch (IllegalArgumentException iaex) {}
            return null;
        }
    }

    public enum FileStorageType {
        TSV, CSV, PSV
    }

    public enum MLType {
        FUZZY_MATCH, NEAREST_NEIGHBOUR
    }
    
    public static void main(String[] args) {
        System.out.println(Enum.DataStoreType.HDFS.ordinal());
    }
}