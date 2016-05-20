package com.orange.oss.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import zipkin.server.EnableZipkinServer;

//@EnableZipkinServer
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServer {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServer.class, args);
	}
}
