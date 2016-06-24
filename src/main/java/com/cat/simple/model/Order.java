package com.cat.simple.model;

import java.util.Date;

import com.cat.simple.constant.DictEnum.GridType;
import com.cat.simple.constant.DictEnum.OrderStatus;

public class Order {

	private int id;

	private String orderNo;// 区分是否同一订单(保留订单变更记录...)

	private int houseId;// houseId(roomId在明细中补充)

	private int borrowerId;// 用户(租客),修改订单时不可变,userId

	private GridType gridType;// 住房类型(需要在detail中相应处理...)

	private Date begin;// 签约时间

	private Date end;// 到期时间

	private Date happen;// 发生时间

	private OrderStatus status;// 订单状态

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public int getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}

	public GridType getGridType() {
		return gridType;
	}

	public void setGridType(GridType gridType) {
		this.gridType = gridType;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getHappen() {
		return happen;
	}

	public void setHappen(Date happen) {
		this.happen = happen;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
