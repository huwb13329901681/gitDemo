package org.itcast.com;

import org.springframework.stereotype.Service;

@Service
public class ProducerService implements ProducerServiceImpl{

	@TimeRun(name = "时间任务", description = "")
	public Producer getProducer(Integer id) {
		Producer p = new Producer();
		p.setId(id);
		p.setName("huwenbin");
		int i = 1/0;
		return p;
	}

}
