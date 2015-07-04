package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtpmSample {
	@Id()
	private int Id;
	private String sampleCode;// 采样编号
	private String oreDistrict;// 矿区

	private int fileNumber;// 文件编号
	private float posX;// 横坐标
	private float posY;// 纵坐标
	private String microreliefImage;// 微地形照
	private int soilProp;// 土壤性质/岩性
	private String soilPeriod;// 土壤层/岩石所属时代
	private String corrodeSummary;// 蚀变矿化情况简述
	private String remarks;// 备注
	private String sampler;// 采样人
	private String sampleTime;// 采样日期
	private String recordPerson;// 记录人
	private String recordTime;// 记录时间
	private String checkPerson;// 检查人
	private int dataSources;// 数据来源(1：网站 2 终端)

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public int getSoilProp() {
		return soilProp;
	}

	public void setSoilProp(int soilProp) {
		this.soilProp = soilProp;
	}

	public String getCorrodeSummary() {
		return corrodeSummary;
	}

	public void setCorrodeSummary(String corrodeSummary) {
		this.corrodeSummary = corrodeSummary;
	}

	public String getSoilPeriod() {
		return soilPeriod;
	}

	public void setSoilPeriod(String soilPeriod) {
		this.soilPeriod = soilPeriod;
	}

	public String getMicroreliefImage() {
		return microreliefImage;
	}

	public void setMicroreliefImage(String microreliefImage) {
		this.microreliefImage = microreliefImage;
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

	public int getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getSampleCode() {
		return sampleCode;
	}

	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	public String getOreDistrict() {
		return oreDistrict;
	}

	public void setOreDistrict(String oreDistrict) {
		this.oreDistrict = oreDistrict;
	}
}
