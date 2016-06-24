package com.cat.simple.model;

import java.math.BigDecimal;
import java.util.Date;

import com.cat.simple.constant.DictEnum.CalcType;
import com.cat.simple.constant.DictEnum.FeeType;
import com.cat.simple.constant.DictEnum.GridType;

/**
 * 计费参照   : 小区,房屋,房间,第三方...这里简化为获取依据为house 或   room
 * @author Cat
 * id:xx,gird:101,girdtype:套房,feetype:房租,calctype:按数量,price:2777,unit:套,date:2016-06-15
 * id:yy,gird:401,girdtype:房间,feetype:房租,calctype:按面积,price:40,unit:平方米,date:2012-06-15
 *
 */
public class FeeRef {

	private int id;

	// gridId+gridType联合定位计费目标
	private int gridId;
	private GridType gridType;

	private FeeType feeType;// 费用类型

	private CalcType calcType;// 计价方式(单价所指...)

	private BigDecimal price;// 单价

	private String unit;// 单位

	private Date date;// 物价发布时间,计费时根据签约时间相应计算(水电等费用可能统一提价,租金等在租期内不能修改...)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGridId() {
		return gridId;
	}

	public void setGridId(int gridId) {
		this.gridId = gridId;
	}

	public GridType getGridType() {
		return gridType;
	}

	public void setGridType(GridType gridType) {
		this.gridType = gridType;
	}

	public FeeType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeType feeType) {
		this.feeType = feeType;
	}

	public CalcType getCalcType() {
		return calcType;
	}

	public void setCalcType(CalcType calcType) {
		this.calcType = calcType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
