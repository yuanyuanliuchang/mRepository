package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell У����ϸֵ
 */
public class DKZtHoleCorDetailed {
	@Id()
	private int id;
	private String correction_id;// fk У��id
	private String section_code;// varchar2 50 default ��¼����
	private float core_length;// float 3 default У�����
	private float taking_rate;// float 3 default ���
	private float well_depth;// float 3 default �����
	private String ore_name;// varchar2 20 default ��������
	private String sampler;// varchar2 20 default �����춥��
	private Date sample_time;// date default ʵ�ⷽλ��
	private String deliver;// varchar2 20 default ��������
	private String delive_time;// varchar2 20 default ��������
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

	public String getCorrection_id() {
		return correction_id;
	}

	public void setCorrection_id(String correction_id) {
		this.correction_id = correction_id;
	}

	public String getSection_code() {
		return section_code;
	}

	public void setSection_code(String section_code) {
		this.section_code = section_code;
	}

	public String getOre_name() {
		return ore_name;
	}

	public void setOre_name(String ore_name) {
		this.ore_name = ore_name;
	}

	public String getDeliver() {
		return deliver;
	}

	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}

	public String getDelive_time() {
		return delive_time;
	}

	public void setDelive_time(String delive_time) {
		this.delive_time = delive_time;
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

	public short getData_sources() {
		return data_sources;
	}

	public void setData_sources(short data_sources) {
		this.data_sources = data_sources;
	}
}
