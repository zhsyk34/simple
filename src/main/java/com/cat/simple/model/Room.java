package com.cat.simple.model;

import java.math.BigDecimal;

public class Room {

	private int id;

	private int houseId;

	private String name;// 在house中的索引(名称),同house下不允许重复

	private BigDecimal area;// 面积

	private boolean used;// 是否已使用

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

}
