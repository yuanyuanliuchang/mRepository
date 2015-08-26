package com.chemicalprospecting;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;
import org.kymjs.kjframe.database.annotate.ManyToOne;

public class DKHtsxSample {

	@Id()
	private int Id;// 采样ID
	private String sampleCode;// 采样编号
	private int itemID;// 外键 工程ID
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
	private Date sampleTime;// 采样日期
	private String recordPerson;// 记录人
	private Date recordTime;// 记录时间
	private String checkPerson;// 检查人
	private short dataSources;// 数据来源
	private String operator;// 操作人
	private String operTime;// 操作时间
	private String MicroTopography;// 微地形照
	@ManyToOne(column = "dkHtsxItemDataId")
	private DKHtsxItemData dkHtsxItemdata;

	/**
	 * @return the microTopography
	 */
	public String getMicroTopography() {
		return MicroTopography;
	}

	/**
	 * @param microTopography
	 *            the microTopography to set
	 */
	public void setMicroTopography(String microTopography) {
		MicroTopography = microTopography;
	}

	/**
	 * @return the dkHtsxItemdata
	 */
	public DKHtsxItemData getDkHtsxItemdata() {
		return dkHtsxItemdata;
	}

	/**
	 * @param dkHtsxItemdata
	 *            the dkHtsxItemdata to set
	 */
	public void setDkHtsxItemdata(DKHtsxItemData dkHtsxItemdata) {
		this.dkHtsxItemdata = dkHtsxItemdata;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * @return the sampleTime
	 */
	public Date getSampleTime() {
		return sampleTime;
	}

	/**
	 * @param sampleTime
	 *            the sampleTime to set
	 */
	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}

	/**
	 * @return the recordTime
	 */
	public Date getRecordTime() {
		return recordTime;
	}

	/**
	 * @param recordTime
	 *            the recordTime to set
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
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

	public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public short getDataSources() {
		return dataSources;
	}

	public void setDataSources(short dataSources) {
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
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "DKHtsxSample [Id=" + Id + ", sampleCode=" + sampleCode + ", itemID=" + itemID + ", oreDistrict="
				+ oreDistrict + ", posX=" + posX + ", posY=" + posY + ", waterProp=" + waterProp + ", repeFlag="
				+ repeFlag + ", samplColor=" + samplColor + ", sampleParticle=" + sampleParticle + ", sampleWeight="
				+ sampleWeight + ", remarks=" + remarks + ", sampler=" + sampler + ", sampleTime=" + sampleTime
				+ ", recordPerson=" + recordPerson + ", recordTime=" + recordTime + ", checkPerson=" + checkPerson
				+ ", dataSources=" + dataSources + ", operator=" + operator + ", operTime=" + operTime + "]";
	}
}
