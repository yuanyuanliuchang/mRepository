package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell 校正详细值
 */
public class DKZtHoleCorDetailed {
	@Id()
	private int id;
	private String correction_id;// fk 校正id
	private String section_code;// varchar2 50 default 记录孔深
	private float core_length;// float 3 default 校测孔深
	private float taking_rate;// float 3 default 误差
	private float well_depth;// float 3 default 误差率
	private String ore_name;// varchar2 20 default 测量孔深
	private String sampler;// varchar2 20 default 测量天顶角
	private Date sample_time;// date default 实测方位角
	private String deliver;// varchar2 20 default 测量方法
	private String delive_time;// varchar2 20 default 测量仪器
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
