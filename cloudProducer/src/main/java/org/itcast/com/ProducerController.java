package org.itcast.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducerController {
	
	@Autowired
	private ProducerServiceImpl producerServiceImpl;

	@RequestMapping(value="/call/{id}" , method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Producer call(@PathVariable Integer id){
		Producer p = producerServiceImpl.getProducer(id);
		return p;
	}
}
