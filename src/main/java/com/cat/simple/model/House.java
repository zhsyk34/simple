package com.cat.simple.model;

import java.math.BigDecimal;
import java.util.Date;

import com.cat.simple.constant.DictEnum.RentState;

public class House {

	private int id;

	private int ownerId;// 房东userId

	private String name;// 名称(坐标)

	private BigDecimal area;// 面积(+公摊...)

	private int rooms;// 房间数量(真实数量,挂名其下出租的room不得超过此数...)

	private Date build;// 模拟小区建筑时间...

	private RentState rentState;// 托管状态

	private boolean used;// 是否已使用(其下所有房间的状态...)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
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

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Date getBuild() {
		return build;
	}

	public void setBuild(Date build) {
		this.build = build;
	}

	public RentState getRentState() {
		return rentState;
	}

	public void setRentState(RentState rentState) {
		this.rentState = rentState;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

}
