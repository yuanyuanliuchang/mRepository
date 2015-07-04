package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell 钻孔回次记录表
 */
public class DKZtRound {
	@Id()
	private int id;// varchar2 50 pk 回次编号
	private String hole_id;// varchar2 50 fk 钻孔id
	private String project_id;// varchar2 50 fk 工程id
	private float next_record_depth;// float 3 default 下届记录孔深
	private int core_count;// number 2 default 岩芯块数
	private float core_length;// float 3 default 岩芯长度(m)
	private float lastleft;// float 3 default 上次残留
	private float deal_core_length;// float 3 default 处理后岩芯长(m)
	private float sampling_rate;// float 3 default 回次采取率（%）
	private float hole_covalue;// float 3 default 孔深校正量
	private float next_hole_covalue;// float 3 default 下届校正孔深
	private String remarks;// varchar2 500 default 备注
	private String record_person;// varchar2 20 default 记录者
	private Date record_time;// date default 记录日期
	private String check_person;// varchar2 20 default 检查者
	private Date check_time;// date default 检查日期
	private short data_sources;// number 2 default 数据来源(1:网站 2:终端)
	private String operator;// varchar2 20 default 操作人
	private String oper_time;// varchar2 20 default 操作时间
	private short del_flag;// number 2 default 删除状态(0:正常 1:删除)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCore_count() {
		return core_count;
	}

	public void setCore_count(int core_count) {
		this.core_count = core_count;
	}

	public String getHole_id() {
		return hole_id;
	}

	public void setHole_id(String hole_id) {
		this.hole_id = hole_id;
	}

	public float getCore_length() {
		return core_length;
	}

	public void setCore_length(float core_length) {
		this.core_length = core_length;
	}

	public float getLastleft() {
		return lastleft;
	}

	public void setLastleft(float lastleft) {
		this.lastleft = lastleft;
	}

	public float getDeal_core_length() {
		return deal_core_length;
	}

	public void setDeal_core_length(float deal_core_length) {
		this.deal_core_length = deal_core_length;
	}

	public float getSampling_rate() {
		return sampling_rate;
	}

	public void setSampling_rate(float sampling_rate) {
		this.sampling_rate = sampling_rate;
	}

	public float getHole_covalue() {
		return hole_covalue;
	}

	public void setHole_covalue(float hole_covalue) {
		this.hole_covalue = hole_covalue;
	}

	public float getNext_hole_covalue() {
		return next_hole_covalue;
	}

	public void setNext_hole_covalue(float next_hole_covalue) {
		this.next_hole_covalue = next_hole_covalue;
	}

	public float getNext_record_depth() {
		return next_record_depth;
	}

	public void setNext_record_depth(float next_record_depth) {
		this.next_record_depth = next_record_depth;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getSampleDepth() {
		return oper_time;
	}

	public void setSampleDepth(String oper_time) {
		this.oper_time = oper_time;
	}

	public short getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(short del_flag) {
		this.del_flag = del_flag;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCheck_person() {
		return check_person;
	}

	public void setCheck_person(String check_person) {
		this.check_person = check_person;
	}

	public short getData_sources() {
		return data_sources;
	}

	public void setData_sources(short data_sources) {
		this.data_sources = data_sources;
	}

	public Date getCheck_time() {
		return check_time;
	}

	public void setCheck_time(Date check_time) {
		this.check_time = check_time;
	}

	public Date getRecordTime() {
		return record_time;
	}

	public void setRecordTime(Date record_time) {
		this.record_time = record_time;
	}

	public String getRecord_person() {
		return record_person;
	}

	public void setRecord_person(String record_person) {
		this.record_person = record_person;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
