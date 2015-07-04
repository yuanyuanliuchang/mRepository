package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

public class DKDrillingImage {
	@Id()
	private int id;
	private String image_code;// varchar2 50 default
	private String item_id;// varchar2 50 default
	private String sample_id;// varchar2 50 default
	private String image_object;// varchar2 50 default
	private String pixel;// varchar2 50 default
	private String file_id;// varchar2 default
	private String reference_obj;// varchar2 50 default
	private String reference_obj_size;// varchar2 20 default
	private String description;// varchar2 1000 default
	private Date record_time;// date default
	private Date image_time;// date default
	private short direction;// number 1 0 default
	private float image_pos_x;// float 6 default
	private float image_pos_y;// float 6 default
	private short data_sources;// number 2 default 数据来源(1:网站 2:终端)
	private short dataStatus;// number 2 default 状态(0:正常 1:删除)
	private String operator;// varchar2 20 default 操作人
	private String oper_time;// varchar2 20 default 操作时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(short dataStatus) {
		this.dataStatus = dataStatus;
	}

	public String getSampleDepth() {
		return oper_time;
	}

	public void setSampleDepth(String oper_time) {
		this.oper_time = oper_time;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public short getData_sources() {
		return data_sources;
	}

	public void setData_sources(short data_sources) {
		this.data_sources = data_sources;
	}

	public String getSample_id() {
		return sample_id;
	}

	public void setSample_id(String sample_id) {
		this.sample_id = sample_id;
	}

	public String getImage_object() {
		return image_object;
	}

	public void setImage_object(String image_object) {
		this.image_object = image_object;
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public String getReference_obj_size() {
		return reference_obj_size;
	}

	public void setReference_obj_size(String reference_obj_size) {
		this.reference_obj_size = reference_obj_size;
	}

	public String getReference_obj() {
		return reference_obj;
	}

	public void setReference_obj(String reference_obj) {
		this.reference_obj = reference_obj;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRecord_time() {
		return record_time;
	}

	public void setRecord_time(Date record_time) {
		this.record_time = record_time;
	}

	public Date getImage_time() {
		return image_time;
	}

	public void setImage_time(Date image_time) {
		this.image_time = image_time;
	}

	public short getDirection() {
		return direction;
	}

	public void setDirection(short direction) {
		this.direction = direction;
	}

	public String getImage_code() {
		return image_code;
	}

	public void setImage_code(String image_code) {
		this.image_code = image_code;
	}

	public float getImage_pos_x() {
		return image_pos_x;
	}

	public void setImage_pos_x(float image_pos_x) {
		this.image_pos_x = image_pos_x;
	}

	public float getImage_pos_y() {
		return image_pos_y;
	}

	public void setImage_pos_y(float image_pos_y) {
		this.image_pos_y = image_pos_y;
	}
}
