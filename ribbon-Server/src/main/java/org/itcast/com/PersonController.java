package org.itcast.com;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping(value = "/person",method=RequestMethod.GET)
	public Person getPerson(HttpServletRequest request){
		Person p = new Person();
		p.setId(1);
		p.setName("huwenbin");
		p.setMessage(request.getRequestURL().toString());
		return p;
	}
}
