package com.orange.oss.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;



@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard   {

	public static void main(String[] args) {
		//can skip ssl validation.
		//get from https://github.com/pivotal-cf/identity-sample-apps/tree/master/authcode/src/main/java/org/cloudfoundry/identity/samples/authcode
		if ("true".equals(System.getenv("SKIP_SSL_VALIDATION"))) {
			SSLValidationDisabler.disableSSLValidation();
		}

		
		SpringApplication.run(HystrixDashBoard.class, args);
	}
	
//	@Controller
//	class HystrixDashboardController {
//
//	    @RequestMapping("/")
//	    public String home() {
//	        return "forward:/hystrix/index.html";
//	    }
//
//	}
	
}
