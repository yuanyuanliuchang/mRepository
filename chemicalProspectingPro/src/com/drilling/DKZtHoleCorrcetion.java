package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell ����У��������������¼��
 */
public class DKZtHoleCorrcetion {
	@Id()
	private int id;
	private String hole_id;// varchar2 50 fk ���id
	private int depth_times_d;// number default ����Ӧ�����
	private int depth_times_r;// number default ����ʵ�����
	private int depth_times_e;// number default ��������
	private int curv_times_d;// number default ������Ӧ�����
	private int curv_times_r;// number default ������ʵ�����
	private int curv_times_e;// number default �����ȳ������
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

	public int getDepth_times_d() {
		return depth_times_d;
	}

	public void setDepth_times_d(int depth_times_d) {
		this.depth_times_d = depth_times_d;
	}

	public int getDepth_times_r() {
		return depth_times_r;
	}

	public void setDepth_times_r(int depth_times_r) {
		this.depth_times_r = depth_times_r;
	}

	public int getDepth_times_e() {
		return depth_times_e;
	}

	public void setDepth_times_e(int depth_times_e) {
		this.depth_times_e = depth_times_e;
	}

	public int getCurv_times_d() {
		return curv_times_d;
	}

	public void setCurv_times_d(int curv_times_d) {
		this.curv_times_d = curv_times_d;
	}

	public int getCurv_times_r() {
		return curv_times_r;
	}

	public void setCurv_times_r(int curv_times_r) {
		this.curv_times_r = curv_times_r;
	}

	public int getCurv_times_e() {
		return curv_times_e;
	}

	public void setCurv_times_e(int curv_times_e) {
		this.curv_times_e = curv_times_e;
	}

	public String getHole_id() {
		return hole_id;
	}

	public void setHole_id(String hole_id) {
		this.hole_id = hole_id;
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
}
