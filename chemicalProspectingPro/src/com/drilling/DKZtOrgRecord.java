package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell ��̽ԭʼ��¼��
 */
public class DKZtOrgRecord {

	@Id()
	private int id;// PK ��ױ��
	private String project_id;// fk ���̱��
	private String hchs;// varchar2 50 default �شκ�(��)
	private String hche;// varchar2 50 default �شκ�(ֹ)
	private float hxcs;// float 3 default ��о��(��)
	private float hxce;// float 3 default ��о��(ֹ)
	private float fccql;// float 3 default �ֲ��ȡ��(%)
	private float fcjc;// float 3 default �ֲ����
	private float hcks;// float 3 default �������
	private float zjj;// float 3 default ��н�
	private float fczhd;// float 3 default �ֲ�����
	private String dzms;// 200 default ��������
	private String ysmc;// varchar2 50 default ��ʯ����
	private Date jlrq;// date default ��¼����
	private Date jcrq;// date default �������
	private String remarks;// ��ע
	private String record_person;// varchar2 20 default ��¼��
	private String check_person;// varchar2 20 default �����
	private short data_sources;// number 2 default ������Դ(1:��վ 2:�ն�)
	private String operator;// varchar2 20 default ������
	private String oper_time;// varchar2 20 default ����ʱ��
	private short del_flag;// number 2 default ɾ��״̬(0:���� 1:ɾ��)

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
