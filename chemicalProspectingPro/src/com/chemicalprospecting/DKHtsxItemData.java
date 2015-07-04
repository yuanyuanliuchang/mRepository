package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtsxItemData {
	// 将id属性设置为主键，必须有一个主键，
	// 其实如果变量名为：'id'或'_id'默认就是主键
	// 也就是在一个JavaBean里面必须有'id'或'_id'或'@Id()'注解，否则会报错
	@Id()
	private int Id;
	private short dataSources;// 数据来源：1(网站)，2(终端)
	private String recordPerson;
	private String engineer;
	private String operator;// 操作人
	private String operTime;// 操作时间
	private String exploratoryLine;// 矿区
	private String itemCode;// 工程编号
	private int projectNum;// 项目ID，外键
	private short dataStatus;// 数据状态
	private String realStarttime;// 开始时间
	private String realEndtime;// 结束时间
	private String recordTime;// 记录时间

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
