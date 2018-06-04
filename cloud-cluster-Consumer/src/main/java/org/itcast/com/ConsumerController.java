package org.itcast.com;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Configuration
public class ConsumerController {

	//要使用负载均衡给他分配服务使用RestTemplate
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	@GetMapping("/roll")
	@ResponseBody
	public String consumer(){
		RestTemplate tmpl = getRestTemplate();
		String json = tmpl.getForObject("http://cluster-producer/call/1", String.class);
		return json;
	}
}
