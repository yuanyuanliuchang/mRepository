package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

//��������
public class DKHttrSample {
	@Id()
	private int Id;
	private String oreDistrict;// ����
	private int fileNumber;// �ļ����
	private float posX;// ������
	private float posY;// ������
	private String sampleLayerpos;// ������λ
	private float sampleDepth;// �������(cm)
	private String sampleColor;// ��Ʒ��ɫ
	private int soilType;// ��������
	private String geologySummary;// �����������
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

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public String getSampleCode() {
		return sampleCode;
	}

	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	public String getGeologySummary() {
		return geologySummary;
	}

	public void setGeologySummary(String geologySummary) {
		this.geologySummary = geologySummary;
	}

	public int getSoilType() {
		return soilType;
	}

	public void setSoilType(int soilType) {
		this.soilType = soilType;
	}

	public float getSampleDepth() {
		return sampleDepth;
	}

	public void setSampleDepth(float sampleDepth) {
		this.sampleDepth = sampleDepth;
	}

	public String getSampleColor() {
		return sampleColor;
	}

	public void setSampleColor(String sampleColor) {
		this.sampleColor = sampleColor;
	}

	public String getSampleLayerpos() {
		return sampleLayerpos;
	}

	public void setSampleLayerpos(String sampleLayerpos) {
		this.sampleLayerpos = sampleLayerpos;
	}

	public int getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(int fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getSampler() {
		return sampler;
	}

	public void setSampler(String sampler) {
		this.sampler = sampler;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getDataSources() {
		return dataSources;
	}

	public void setDataSources(int dataSources) {
		this.dataSources = dataSources;
	}

}
