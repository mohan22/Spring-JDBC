package com.springtest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Circle {
	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle(int circleID, String name) {
		setId(circleID);
		setName(name);
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "ID=" + id + "  Name= " + name;
	}

}
