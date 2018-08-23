package com.fairvalyou.datamanger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.fairvalyou.datamanger.repositories")
public class DatamangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatamangerApplication.class, args);
    }
}
