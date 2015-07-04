package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKSupervisionProg {
	@Id()
	private int Id;// 监理进度id
	private String itemId;// 工程ID fk
	private String projectId;// 项目ID fk
	private float fortyPerSummary;// 完成进度40%及质量成果简述 3位有效精度
	private float seventyPerSummary;// 完成进度70%及质量成果简述 3位有效精度
	private float ninetyPerSummary;// 完成进度95%及质量成果简述 3位有效精度
	private float schemeAdjust;// 施工方案调整变更 3位有效精度
	private float overTime;// 野外施工结束日期 3位有效精度
	private String checkSuggestion;// 野外验收日期与主要结论和建议
	private String sampleMark;// 采样代表性（水系/层位/粒度/时代/分布/重复样）
	private String sampleWeight;// 样品重量评价
	private String deviation;// 定点误差
	private String dataQuality;// 数据质量（分析方法、检出限、报出率、准确度、精密度）
	private String imageQuality;// 图件质量
	private String operator;// 操作人
	private String operTime;// 操作时间
	private short dataSources;// 数据来源(1:网站 2:终端)
	private String recordTime;// 记录时间
	private String recordPerson;// 记录人

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
