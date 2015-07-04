package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtsxItemData {
	// ��id��������Ϊ������������һ��������
	// ��ʵ���������Ϊ��'id'��'_id'Ĭ�Ͼ�������
	// Ҳ������һ��JavaBean���������'id'��'_id'��'@Id()'ע�⣬����ᱨ��
	@Id()
	private int Id;
	private short dataSources;// ������Դ��1(��վ)��2(�ն�)
	private String recordPerson;
	private String engineer;
	private String operator;// ������
	private String operTime;// ����ʱ��
	private String exploratoryLine;// ����
	private String itemCode;// ���̱��
	private int projectNum;// ��ĿID�����
	private short dataStatus;// ����״̬
	private String realStarttime;// ��ʼʱ��
	private String realEndtime;// ����ʱ��
	private String recordTime;// ��¼ʱ��

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public short getDataSources() {
		return dataSources;
	}

	public void setDataSources(short dataSources) {
		this.dataSources = dataSources;
	}

	public short getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(short dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public String getEngineer() {
		return engineer;
	}

	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	public int getProjectNum() {
		return projectNum;
	}

	public void setExploratoryLine(String exploratoryLine) {
		this.exploratoryLine = exploratoryLine;
	}

	public String getExploratoryLine() {
		return exploratoryLine;
	}

	public void setRealStarttime(String temp_str) {
		realStarttime = temp_str;
	}

	public String getRealStarttime() {
		return realStarttime;
	}

	public void setRealEndtime(String temp_str) {
		realEndtime = temp_str;
	}

	public String getRealEndtime() {
		return realEndtime;
	}

	public void setRecordTime(String temp_str) {
		recordTime = temp_str;
	}

	public String getRecordTime() {
		return recordTime;
	}
}
