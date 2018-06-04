package org.itcast.com;

import java.io.Serializable;

public class Producer implements Serializable {

	private static final long serialVersionUID = -4721423390169473245L;

	private String name;
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
