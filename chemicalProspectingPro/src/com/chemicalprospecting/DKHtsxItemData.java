package com.chemicalprospecting;

import java.util.Date;

import org.kymjs.kjframe.database.OneToManyLazyLoader;
import org.kymjs.kjframe.database.annotate.Id;
import org.kymjs.kjframe.database.annotate.OneToMany;

public class DKHtsxItemData {

	@Id()
	private int Id;
	private short dataSources;// 数据来源 2字节
	private String recordPerson;// 20字节
	private String engineer;// 20字节
	private String department;
	private String operator;// 20字节
	private String operTime;// 20字节
	private String exploratoryLine;// 矿区 50字节
	private String itemCode;// 工程编号 50字节
	private String projectID;// 项目ID
	private short dataStatus;// 数据状态 2字节
	private Date realStarttime;// 实际开始时间
	private Date realEndtime;// 实际结束时间
	private Date recordTime;// 记录时间
	@OneToMany(manyColumn = "dkHtsxItemDataId")
	private OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> dkhtsxSample;

	/**
	 * @return the projectID
	 */
	public String getProjectID() {
		return projectID;
	}

	/**
	 * @param projectID
	 *            the projectID to set
	 */
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	/**
	 * @return the dkhtsxSample
	 */
	public OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> getDkhtsxSample() {
		return dkhtsxSample;
	}

	/**
	 * @param dkhtsxSample
	 *            the dkhtsxSample to set
	 */
	public void setDkhtsxSample(OneToManyLazyLoader<DKHtsxItemData, DKHtsxSample> dkhtsxSample) {
		this.dkhtsxSample = dkhtsxSample;
	}

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

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
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

	public void setProjectNum(String projectNum) {
		this.projectID = projectNum;
	}

	public String getProjectNum() {
		return projectID;
	}

	public void setExploratoryLine(String exploratoryLine) {
		this.exploratoryLine = exploratoryLine;
	}

	public String getExploratoryLine() {
		return exploratoryLine;
	}

	public void setRealStarttime(Date temp_str) {
		realStarttime = temp_str;
	}

	public Date getRealStarttime() {
		return realStarttime;
	}

	public void setRealEndtime(Date temp_str) {
		realEndtime = temp_str;
	}

	public Date getRealEndtime() {
		return realEndtime;
	}

	public void setRecordTime(Date temp_str) {
		recordTime = temp_str;
	}

	public Date getRecordTime() {
		return recordTime;
	}
}
