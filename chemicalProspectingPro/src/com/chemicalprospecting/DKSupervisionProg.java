package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKSupervisionProg {
	@Id()
	private int Id;// �������id
	private String itemId;// ����ID fk
	private String projectId;// ��ĿID fk
	private float fortyPerSummary;// ��ɽ���40%�������ɹ����� 3λ��Ч����
	private float seventyPerSummary;// ��ɽ���70%�������ɹ����� 3λ��Ч����
	private float ninetyPerSummary;// ��ɽ���95%�������ɹ����� 3λ��Ч����
	private float schemeAdjust;// ʩ������������� 3λ��Ч����
	private float overTime;// Ұ��ʩ���������� 3λ��Ч����
	private String checkSuggestion;// Ұ��������������Ҫ���ۺͽ���
	private String sampleMark;// ���������ԣ�ˮϵ/��λ/����/ʱ��/�ֲ�/�ظ�����
	private String sampleWeight;// ��Ʒ��������
	private String deviation;// �������
	private String dataQuality;// ������������������������ޡ������ʡ�׼ȷ�ȡ����ܶȣ�
	private String imageQuality;// ͼ������
	private String operator;// ������
	private String operTime;// ����ʱ��
	private short dataSources;// ������Դ(1:��վ 2:�ն�)
	private String recordTime;// ��¼ʱ��
	private String recordPerson;// ��¼��

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public float getFortyPerSummary() {
		return fortyPerSummary;
	}

	public void setFortyPerSummary(float fortyPerSummary) {
		this.fortyPerSummary = fortyPerSummary;
	}

	public float getSeventyPerSummary() {
		return seventyPerSummary;
	}

	public void setSeventyPerSummary(float seventyPerSummary) {
		this.seventyPerSummary = seventyPerSummary;
	}

	public float getNinetyPerSummary() {
		return ninetyPerSummary;
	}

	public void setNinetyPerSummary(float ninetyPerSummary) {
		this.ninetyPerSummary = ninetyPerSummary;
	}

	public float getSchemeAdjust() {
		return schemeAdjust;
	}

	public void setSchemeAdjust(float schemeAdjust) {
		this.schemeAdjust = schemeAdjust;
	}

	public float getOverTime() {
		return overTime;
	}

	public void setOverTime(float overTime) {
		this.overTime = overTime;
	}

	public int getDataSources() {
		return dataSources;
	}

	public void setDataSources(short dataSources) {
		this.dataSources = dataSources;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
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

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getImageQuality() {
		return imageQuality;
	}

	public void setImageQuality(String imageQuality) {
		this.imageQuality = imageQuality;
	}

	public String getDataQuality() {
		return dataQuality;
	}

	public void setDataQuality(String dataQuality) {
		this.dataQuality = dataQuality;
	}

	public String getDeviation() {
		return deviation;
	}

	public void setDeviation(String deviation) {
		this.deviation = deviation;
	}

	public String getSampleWeight() {
		return sampleWeight;
	}

	public void setSampleWeight(String sampleWeight) {
		this.sampleWeight = sampleWeight;
	}

	public String getSampleMark() {
		return sampleMark;
	}

	public void setSampleMark(String sampleMark) {
		this.sampleMark = sampleMark;
	}

	public String getCheckSuggestion() {
		return checkSuggestion;
	}

	public void setCheckSuggestion(String checkSuggestion) {
		this.checkSuggestion = checkSuggestion;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
}
