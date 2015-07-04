package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKHtException {
	@Id()
	private int Id;
	private String exceptionCode;// 异常编号 外键
	private String projectId;// 项目ID 外键
	private String imageNum;// 图幅号(IMAGE_CODE合集) 外键
	private String position;// 位置
	private String workProp;// 工作性质
	private String workMethod;// 工作方法
	private float exceptionArea;// 异常面积
	private int exceptionType;// 异常类别
	private String geologySummary;// 地质概况
	private String pastworkSummary;// 以往工作评述
	private String excComment;// 异常解释推断与评价
	private String workSuggest;// 进一步工作建议
	private String recordPerson;// 记录者
	private String principal;// 负责人
	private String recordTime;// 记录日期
	private int dataSources;// 数据来源(1:网站 2:终端)
	private String operator;// 操作人
	private String operTime;// 操作时间
	private String remarks;// 备注

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
