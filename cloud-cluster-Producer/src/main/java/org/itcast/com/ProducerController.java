package org.itcast.com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {

	@RequestMapping(value="/call/{id}" , method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Producer call(@PathVariable Integer id,HttpServletRequest request){
		Producer p = new Producer();
		p.setId(id);
		p.setName("huwenbin");
		p.setMessage(request.getRequestURL().toString());
		return p;
	}
}
