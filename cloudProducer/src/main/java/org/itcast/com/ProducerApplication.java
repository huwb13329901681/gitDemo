package org.itcast.com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProducerApplication.class).web(true).run(args);
	}
}
