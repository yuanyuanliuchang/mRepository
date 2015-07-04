package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell ��̽������¼��
 */
public class DKZtSample {
	@Id()
	private int id;
	private String sample_code;// varchar2 50 default ��Ʒ���
	private String hole_id;// varchar2 50 fk ���id
	private String project_id;// varchar2 50 fk ����id
	private String section_code;// varchar2 50 default ������
	private float core_length;// float 3 default ��о����
	private float taking_rate;// float 3 default ��о������
	private float well_depth_s;// float default ����������
	private float well_depth_e;// float default ����������
	private float sample_length;// float 3 default ������������
	private String ore_name;// varchar2 20 default ��ʯ����
	private String sampler;// varchar2 20 default ������
	private Date sample_time;// date default ��������
	private String deliver;// varchar2 20 default ������
	private Date delive_time;// date default ��������
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

	public float getCore_length() {
		return core_length;
	}

	public void setCore_length(float core_length) {
		this.core_length = core_length;
	}

	public float getTaking_rate() {
		return taking_rate;
	}

	public void setTaking_rate(float taking_rate) {
		this.taking_rate = taking_rate;
	}

	public float getWell_depth_s() {
		return well_depth_s;
	}

	public void setWell_depth_s(float well_depth_s) {
		this.well_depth_s = well_depth_s;
	}

	public float getWell_depth_e() {
		return well_depth_e;
	}

	public void setWell_depth_e(float well_depth_e) {
		this.well_depth_e = well_depth_e;
	}

	public float getSample_length() {
		return sample_length;
	}

	public void setSample_length(float sample_length) {
		this.sample_length = sample_length;
	}

	public String getSampler() {
		return sampler;
	}

	public void setSampler(String sampler) {
		this.sampler = sampler;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	public String getSection_code() {
		return section_code;
	}

	public void setSection_code(String section_code) {
		this.section_code = section_code;
	}

	public String getSample_code() {
		return sample_code;
	}

	public void setSample_code(String sample_code) {
		this.sample_code = sample_code;
	}

	public String getOre_name() {
		return ore_name;
	}

	public void setOre_name(String ore_name) {
		this.ore_name = ore_name;
	}

	public String getHole_id() {
		return hole_id;
	}

	public void setHole_id(String hole_id) {
		this.hole_id = hole_id;
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

	public Date getSample_time() {
		return sample_time;
	}

	public void setSample_time(Date sample_time) {
		this.sample_time = sample_time;
	}

	public Date getDelive_time() {
		return delive_time;
	}

	public void setDelive_time(Date delive_time) {
		this.delive_time = delive_time;
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
