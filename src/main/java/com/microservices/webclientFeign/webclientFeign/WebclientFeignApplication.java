package com.microservices.webclientFeign.webclientFeign;

import com.microservices.webclientFeign.webclientFeign.client.EntryPointClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebclientFeignApplication implements CommandLineRunner {
	private final Log logger = LogFactory.getLog(WebclientFeignApplication.class);
	@Autowired
	EntryPointClient entryPointClient;
	public static void main(String[] args) {
		SpringApplication.run(WebclientFeignApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		logger.info("calling ENTRYENDPOINT getRoot /root, with response " + entryPointClient.getRoot());
	}
}
