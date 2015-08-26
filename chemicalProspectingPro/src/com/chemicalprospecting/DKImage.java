package com.chemicalprospecting;

import org.kymjs.kjframe.database.annotate.Id;
import org.kymjs.kjframe.database.annotate.ManyToOne;

public class DKImage {
	@Id()
	private int Id;
	private String imageCode;//
	private String itemId;//
	private String sampleId;//
	private String imageObject;//
	private String recordTime;//
	private String imageTime;// ����ʱ��
	private String pixel;// ����
	private int direction;// ����
	private String referenceObj;// ����������
	private String referenceObjSize;// �������С
	private String description;// ����
	private float imagePosX;// ��������X(��γ��) ����6λС��
	private float imagePosY;// ��������Y(��γ��) ����6λС��
	private String fileId;// �ļ�ID
	private short dataSources;// ������Դ(1:��վ 2:�ն�)
	private String operator;// ������
	private String operTime;// ����ʱ��
	private short dataStatus;// ״̬(0:���� 1:ɾ��)
	@ManyToOne(column = "dkHtsxItemDataId")
	private DKHtsxItemData dkHtsxItemdata;

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
