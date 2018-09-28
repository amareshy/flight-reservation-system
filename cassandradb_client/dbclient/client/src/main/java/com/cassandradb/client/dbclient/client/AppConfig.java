package com.cassandradb.client.dbclient.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cassandradb.client.dbclient.client.persistence.cql.ClusterHolder;
import com.cassandradb.client.dbclient.client.persistence.cql.DBClusterConnectionProperties;

@Configuration
@ComponentScan("com.cassandradb.client.dbclient")
public class AppConfig {

    @Bean(name = "myDBClusterConnectionProperties")
    public DBClusterConnectionProperties getDBClusterConnectionProperties() {
        return new DBClusterConnectionProperties();
    }

    @Bean(name = "myCluster")
    public ClusterHolder getCluster() {
        return new ClusterHolder();
    }
}
