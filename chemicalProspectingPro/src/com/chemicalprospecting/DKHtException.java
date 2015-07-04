package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtException {
	@Id()
	private int Id;
	private String exceptionCode;// �쳣��� ���
	private String projectId;// ��ĿID ���
	private String imageNum;// ͼ����(IMAGE_CODE�ϼ�) ���
	private String position;// λ��
	private String workProp;// ��������
	private String workMethod;// ��������
	private float exceptionArea;// �쳣���
	private int exceptionType;// �쳣���
	private String geologySummary;// ���ʸſ�
	private String pastworkSummary;// ������������
	private String excComment;// �쳣�����ƶ�������
	private String workSuggest;// ��һ����������
	private String recordPerson;// ��¼��
	private String principal;// ������
	private String recordTime;// ��¼����
	private int dataSources;// ������Դ(1:��վ 2:�ն�)
	private String operator;// ������
	private String operTime;// ����ʱ��
	private String remarks;// ��ע

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getImageNum() {
		return imageNum;
	}

	public void setImageNum(String imageNum) {
		this.imageNum = imageNum;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getWorkProp() {
		return workProp;
	}

	public void setWorkProp(String workProp) {
		this.workProp = workProp;
	}

	public String getWorkMethod() {
		return workMethod;
	}

	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}

	public float getExceptionArea() {
		return exceptionArea;
	}

	public void setExceptionArea(float exceptionArea) {
		this.exceptionArea = exceptionArea;
	}

	public int getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(int exceptionType) {
		this.exceptionType = exceptionType;
	}

	public String getGeologySummary() {
		return geologySummary;
	}

	public void setGeologySummary(String geologySummary) {
		this.geologySummary = geologySummary;
	}

	public String getPastworkSummary() {
		return pastworkSummary;
	}

	public void setPastworkSummary(String pastworkSummary) {
		this.pastworkSummary = pastworkSummary;
	}

	public String getExcComment() {
		return excComment;
	}

	public void setExcComment(String excComment) {
		this.excComment = excComment;
	}

	public String getWorkSuggest() {
		return workSuggest;
	}

	public void setWorkSuggest(String workSuggest) {
		this.workSuggest = workSuggest;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
