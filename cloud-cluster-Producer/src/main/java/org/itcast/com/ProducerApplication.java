package org.itcast.com;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//手动输入端口号
		Scanner sca = new Scanner(System.in);
		String port = sca.nextLine();
		new SpringApplicationBuilder(ProducerApplication.class).properties("server.port="+port).run(args);
	}
}
