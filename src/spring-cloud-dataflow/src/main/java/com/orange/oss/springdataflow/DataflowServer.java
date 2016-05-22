package com.orange.oss.springdataflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;



@SpringBootApplication
@EnableDataFlowServer
public class DataflowServer {
	public static void main(String[] args) {
		SpringApplication.run(DataflowServer.class, args);
	}
}
