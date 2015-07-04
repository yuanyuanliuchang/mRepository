package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtExceptionDetailed {
	@Id()
	private int Id;
	private String exceptionCode;// �쳣��� ���
	private float elementName;// Ԫ������
	private float area;// ���
	private float shape;// ��״
	private float maxValue;// ���ֵ
	private float aveValue;// ƽ��ֵ
	private float contrast;// �Ķ�
	private String scale;// ��ģ
	private String rest;// ����

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
