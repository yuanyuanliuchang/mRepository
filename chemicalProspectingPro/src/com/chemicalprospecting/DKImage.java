package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;

public class DKImage {
	@Id()
	private int Id;
	private String imageCode;// 照片编号
	private String itemId;// 工程编号
	private String sampleId;// 样品编号
	private String imageObject;// 影像目的物
	private String recordTime;// 记录时间
	private String imageTime;// 拍照时间
	private String pixel;// 像素
	private int direction;// 方向
	private String referenceObj;// 参照物名称
	private String referenceObjSize;// 参照物大小
	private String description;// 描述
	private float imagePosX;// 拍照坐标X(经纬度) 保留6位小数
	private float imagePosY;// 拍照坐标Y(经纬度) 保留6位小数
	private String fileId;// 文件ID
	private short dataSources;// 数据来源(1:网站 2:终端)
	private String operator;// 操作人
	private String operTime;// 操作时间
	private short dataStatus;// 状态(0:正常 1:删除)

	public int getId() {
		return Id;
	}

	public void setId(int item_id) {
		this.Id = item_id;
	}

	public float getImagePosX() {
		return imagePosX;
	}

	public void setImagePosX(float imagePosX) {
		this.imagePosX = imagePosX;
	}

	public float getImagePosY() {
		return imagePosY;
	}

	public void setImagePosY(float imagePosY) {
		this.imagePosY = imagePosY;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setReferenceObjSize(String referenceObjSize) {
		this.referenceObjSize = referenceObjSize;
	}

	public String getReferenceObjSize() {
		return referenceObjSize;
	}

	public void setReferenceObj(String referenceObj) {
		this.referenceObj = referenceObj;
	}

	public String getReferenceObj() {
		return referenceObj;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public String getPixel() {
		return pixel;
	}

	public void setImageTime(String imageTime) {
		this.imageTime = imageTime;
	}

	public String getImageTime() {
		return imageTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setImageObject(String imageObject) {
		this.imageObject = imageObject;
	}

	public String getImageObject() {
		return imageObject;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}

	public String getImageCode() {
		return imageCode;
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
}
