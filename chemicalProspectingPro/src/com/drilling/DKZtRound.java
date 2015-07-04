package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell ��׻شμ�¼��
 */
public class DKZtRound {
	@Id()
	private int id;// varchar2 50 pk �شα��
	private String hole_id;// varchar2 50 fk ���id
	private String project_id;// varchar2 50 fk ����id
	private float next_record_depth;// float 3 default �½��¼����
	private int core_count;// number 2 default ��о����
	private float core_length;// float 3 default ��о����(m)
	private float lastleft;// float 3 default �ϴβ���
	private float deal_core_length;// float 3 default �������о��(m)
	private float sampling_rate;// float 3 default �شβ�ȡ�ʣ�%��
	private float hole_covalue;// float 3 default ����У����
	private float next_hole_covalue;// float 3 default �½�У������
	private String remarks;// varchar2 500 default ��ע
	private String record_person;// varchar2 20 default ��¼��
	private Date record_time;// date default ��¼����
	private String check_person;// varchar2 20 default �����
	private Date check_time;// date default �������
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
