package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

//水系沉积物取样记录表
public class DKHtsxSample {
	@Id()
	private int Id;// 主键
	private String sampleCode;// 采样编号

	private int itemID;// 工程ID,外键
	private String oreDistrict;// 矿区
	private float posX;// 横坐标
	private float posY;// 纵坐标
	private String waterProp;// 水系性质
	private String repeFlag;// 是否重复采样
	private String samplColor;// 样品颜色
	private float sampleParticle;// 样品粒度
	private float sampleWeight;// 样品重量
	private String remarks;// 备注
	private String sampler;// 采样人
	private String sampleTime;// 采样日期
	private String recordPerson;// 记录人
	private String recordTime;// 记录时间
	private String checkPerson;// 检查人
	private int dataSources;// 数据来源
	private String operator;// 操作人
	private String operTime;// 操作时间

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getSampleCode() {
		return sampleCode;
	}

	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemNum) {
		this.itemID = itemNum;
	}

	public String getOreDistrict() {
		return oreDistrict;
	}

	public void setOreDistrict(String oreDistrict) {
		this.oreDistrict = oreDistrict;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public String getWaterProp() {
		return waterProp;
	}

	public void setWaterProp(String waterProp) {
		this.waterProp = waterProp;
	}

	public String getRepeFlag() {
		return repeFlag;
	}

	public void setRepeFlag(String repeFlag) {
		this.repeFlag = repeFlag;
	}

	public String getSamplColor() {
		return samplColor;
	}

	public void setSamplColor(String samplColor) {
		this.samplColor = samplColor;
	}

	public float getSampleParticle() {
		return sampleParticle;
	}

	public void setSampleParticle(float sampleParticle) {
		this.sampleParticle = sampleParticle;
	}

	public float getSampleWeight() {
		return sampleWeight;
	}

	public void setSampleWeight(float sampleWeight) {
		this.sampleWeight = sampleWeight;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSampler() {
		return sampler;
	}

	public void setSampler(String sampler) {
		this.sampler = sampler;
	}

	public String getSampleTime() {
		return sampleTime;
	}

	public void setSampleTime(String time) {
		this.sampleTime = time;
	}

	public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String time) {
		this.recordTime = time;
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public int getDataSources() {
		return dataSources;
	}

	public void setDataSources(int dataSources) {
		this.dataSources = dataSources;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}
}
