package com.sdw.dao.model;

import java.io.Serializable;

/**
 *
 */
public class Test implements Serializable{
	//
	private Integer id;
	//
	private String name;

	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}
}
