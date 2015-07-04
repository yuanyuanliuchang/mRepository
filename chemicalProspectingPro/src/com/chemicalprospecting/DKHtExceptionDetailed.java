package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtExceptionDetailed {
	@Id()
	private int Id;
	private String exceptionCode;// 异常编号 外键
	private float elementName;// 元素名称
	private float area;// 面积
	private float shape;// 形状
	private float maxValue;// 最高值
	private float aveValue;// 平均值
	private float contrast;// 衬度
	private String scale;// 规模
	private String rest;// 其他

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public String setRest() {
		return rest;
	}

	public void setRest(String rest) {
		this.rest = rest;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public float getContrast() {
		return contrast;
	}

	public void setContrast(float contrast) {
		this.contrast = contrast;
	}

	public float getAveValue() {
		return aveValue;
	}

	public void setAveValue(float aveValue) {
		this.aveValue = aveValue;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public float getElementName() {
		return elementName;
	}

	public void setElementName(float elementName) {
		this.elementName = elementName;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getShape() {
		return shape;
	}

	public void setShape(float shape) {
		this.shape = shape;
	}

	public float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(float maxValue) {
		this.maxValue = maxValue;
	}
}
