package com.orange.oss.springdataflow;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@EnableDataFlowShell
@SpringBootApplication
public class DataflowShellApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DataflowShellApplication.class)
		//lbannerMode(Ba)
		.run(args);
	}
}
