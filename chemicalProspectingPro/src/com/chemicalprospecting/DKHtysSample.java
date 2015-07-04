package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtysSample {
	@Id()
	private int Id;
	private String remarks;// ��ע
	private String sampler;// ������
	private String sampleTime;// ��������
	private String recordPerson;// ��¼��
	private String recordTime;// ��¼ʱ��
	private String checkPerson;// �����
	private int dataSources;// ������Դ(1����վ 2 �ն�)
	private String operator;// ������
	private String operTime;// ����ʱ��
	private String sampleCode;// �������
	private String oreDistrict;// ����
	private int fileNumber;// �ļ����
	private float posX;// ������
	private float posY;// ������
	private String rockName;// ��ʯ����
	private String rockSummary;// ��ʯ����

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public String getRockSummary() {
		return rockSummary;
	}

	public void setRockSummary(String rockSummary) {
		this.rockSummary = rockSummary;
	}

	public String getRockName() {
		return rockName;
	}

	public void setRockName(String rockName) {
		this.rockName = rockName;
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

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
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
}
