package com.orange.oss.springdataflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.orange.oss.springdataflow.DataflowServer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataflowServer.class)
public class DataflowServerTests {

	@Test
	public void contextLoads() {
	}

}
