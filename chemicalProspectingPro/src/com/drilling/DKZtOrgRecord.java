package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell 钻探原始记录表
 */
public class DKZtOrgRecord {

	@Id()
	private int id;// PK 钻孔编号
	private String project_id;// fk 工程编号
	private String hchs;// varchar2 50 default 回次号(起)
	private String hche;// varchar2 50 default 回次号(止)
	private float hxcs;// float 3 default 岩芯长(起)
	private float hxce;// float 3 default 岩芯长(止)
	private float fccql;// float 3 default 分层采取率(%)
	private float fcjc;// float 3 default 分层进尺
	private float hcks;// float 3 default 换层孔深
	private float zjj;// float 3 default 轴夹角
	private float fczhd;// float 3 default 分层真厚度
	private String dzms;// 200 default 地质描述
	private String ysmc;// varchar2 50 default 岩石名称
	private Date jlrq;// date default 记录日期
	private Date jcrq;// date default 检查日期
	private String remarks;// 备注
	private String record_person;// varchar2 20 default 记录者
	private String check_person;// varchar2 20 default 检查者
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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getYsmc() {
		return ysmc;
	}

	public void setYsmc(String ysmc) {
		this.ysmc = ysmc;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getHchs() {
		return hchs;
	}

	public void setHchs(String hchs) {
		this.hchs = hchs;
	}

	public String getHche() {
		return hche;
	}

	public void setHche(String hche) {
		this.hche = hche;
	}

	public float getHcks() {
		return hcks;
	}

	public void setHcks(float hcks) {
		this.hcks = hcks;
	}

	public float getFcjc() {
		return fcjc;
	}

	public void setFcjc(float fcjc) {
		this.fcjc = fcjc;
	}

	public float getHxce() {
		return hxce;
	}

	public void setHxce(float hxce) {
		this.hxce = hxce;
	}

	public String getDzms() {
		return dzms;
	}

	public void setDzms(String dzms) {
		this.dzms = dzms;
	}

	public float getFccql() {
		return fccql;
	}

	public void setFccql(float fccql) {
		this.fccql = fccql;
	}

	public float getZjj() {
		return zjj;
	}

	public void setZjj(float zjj) {
		this.zjj = zjj;
	}

	public float getFczhd() {
		return fczhd;
	}

	public void setFczhd(float fczhd) {
		this.fczhd = fczhd;
	}

	public Date getJcrq() {
		return jcrq;
	}

	public void setJcrq(Date jcrq) {
		this.jcrq = jcrq;
	}

	public Date getJlrq() {
		return jlrq;
	}

	public void setJlrq(Date jlrq) {
		this.jlrq = jlrq;
	}

	public float getHxcs() {
		return hxcs;
	}

	public void setHxcs(float hxcs) {
		this.hxcs = hxcs;
	}

	public String getSampleDepth() {
		return oper_time;
	}

	public void setSampleDepth(String oper_time) {
		this.oper_time = oper_time;
	}

	public String getCheck_person() {
		return check_person;
	}

	public void setCheck_person(String check_person) {
		this.check_person = check_person;
	}

	public String getRecord_person() {
		return record_person;
	}

	public void setRecord_person(String record_person) {
		this.record_person = record_person;
	}

	public short getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(short del_flag) {
		this.del_flag = del_flag;
	}

	public short getData_sources() {
		return data_sources;
	}

	public void setData_sources(short data_sources) {
		this.data_sources = data_sources;
	}
}
