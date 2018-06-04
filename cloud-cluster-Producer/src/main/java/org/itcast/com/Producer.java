package org.itcast.com;

import java.io.Serializable;

public class Producer implements Serializable {

	private static final long serialVersionUID = 6262571763105226337L;
	
	private String name;
	private Integer id;
	private String message;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
