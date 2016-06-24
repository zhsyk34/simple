package com.cat.simple.model;

import java.math.BigDecimal;
import java.util.Date;

//各种收费依据...这里假设根据house+date可以读取...
public class FeeCount {

	private int id;

	private int houseId;

	private BigDecimal ruling;// 刻度

	private Date date;// 日期

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

	public BigDecimal getRuling() {
		return ruling;
	}

	public void setRuling(BigDecimal ruling) {
		this.ruling = ruling;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
