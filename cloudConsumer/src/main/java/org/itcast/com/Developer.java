package org.itcast.com;

import java.math.BigDecimal;

public class Developer {

	
	private String name;
	
	private BigDecimal money;
	
	private int age;

	public Developer(String name, BigDecimal money ,int age) {
		this.name=name;
		this.money=money;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
