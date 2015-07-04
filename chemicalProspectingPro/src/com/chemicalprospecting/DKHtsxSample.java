package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

//ˮϵ������ȡ����¼��
public class DKHtsxSample {
	@Id()
	private int Id;// ����
	private String sampleCode;// �������

	private int itemID;// ����ID,���
	private String oreDistrict;// ����
	private float posX;// ������
	private float posY;// ������
	private String waterProp;// ˮϵ����
	private String repeFlag;// �Ƿ��ظ�����
	private String samplColor;// ��Ʒ��ɫ
	private float sampleParticle;// ��Ʒ����
	private float sampleWeight;// ��Ʒ����
	private String remarks;// ��ע
	private String sampler;// ������
	private String sampleTime;// ��������
	private String recordPerson;// ��¼��
	private String recordTime;// ��¼ʱ��
	private String checkPerson;// �����
	private int dataSources;// ������Դ
	private String operator;// ������
	private String operTime;// ����ʱ��

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
