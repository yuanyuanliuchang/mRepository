package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell矿产地质钻探监管表
 */
public class DKZtMngProgress {
	@Id()
	private int id;
	private String hole_id;// varchar2 50 fk 钻孔id
	private Date hole_sta_time;// default 项目开工日期
	private Date hole_end_time;// default 单孔终孔日期
	private float mineralize_pos;// default 矿化位置
	private String mineralize_detail;// default 矿化类型及特征
	private float corrode_pos;// default 蚀变位置
	private String corrode_detail;// default 蚀变类型及特征
	private String sampling_rate;// default 矿体（层）采取率
	private float sampling_pos;// default 采样位置
	private String for_per_summary;// default 完成进度40%成果
	private String for_per_confirm;// default 40%监理确认
	private String sev_per_summary;// default 完成进度70%成果
	private String sev_per_confirm;// default 70%监理确认
	private String nine_per_summary;// default 完成进度95%成果
	private String nine_per_confirm;// default 95%监理确认
	private String scheme_adjust;// default 施工方案调整变更
	private String adjust_confirm;// default 变更确认
	private String engineer;// default 编录技术人员
	private String mng_comment;// default 监理评语
	private String hole_grade;// default 钻孔质量评级
	private String grade_confirm;// default 监理评级确认
	private Date grade_time;// default 评定日期
	private String wallrock_phoid;// default 典型围岩照片
	private String corrode_phoid;// default 蚀变照片
	private String mineralize_phoid;// default 矿化照片
	private String ore_phoid;// default 矿石照片
	private String ore_split_phoid;// default 矿芯劈样后照片
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

	public String getHole_id() {
		return hole_id;
	}

	public void setHole_id(String hole_id) {
		this.hole_id = hole_id;
	}

	public String getMineralize_detail() {
		return mineralize_detail;
	}

	public void setMineralize_detail(String mineralize_detail) {
		this.mineralize_detail = mineralize_detail;
	}

	public String getCorrode_detail() {
		return corrode_detail;
	}

	public void setCorrode_detail(String corrode_detail) {
		this.corrode_detail = corrode_detail;
	}

	public String getFor_per_summary() {
		return for_per_summary;
	}

	public void setFor_per_summary(String for_per_summary) {
		this.for_per_summary = for_per_summary;
	}

	public String getFor_per_confirm() {
		return for_per_confirm;
	}

	public void setFor_per_confirm(String for_per_confirm) {
		this.for_per_confirm = for_per_confirm;
	}

	public String getSev_per_summary() {
		return sev_per_summary;
	}

	public void setSev_per_summary(String sev_per_summary) {
		this.sev_per_summary = sev_per_summary;
	}

	public String getSev_per_confirm() {
		return sev_per_confirm;
	}

	public void setSev_per_confirm(String sev_per_confirm) {
		this.sev_per_confirm = sev_per_confirm;
	}

	public String getNine_per_summary() {
		return nine_per_summary;
	}

	public void setNine_per_summary(String nine_per_summary) {
		this.nine_per_summary = nine_per_summary;
	}

	public String getNine_per_confirm() {
		return nine_per_confirm;
	}

	public void setNine_per_confirm(String nine_per_confirm) {
		this.nine_per_confirm = nine_per_confirm;
	}

	public String getScheme_adjust() {
		return scheme_adjust;
	}

	public void setScheme_adjust(String scheme_adjust) {
		this.scheme_adjust = scheme_adjust;
	}

	public void setAdjust_confirm(String adjust_confirm) {
		this.adjust_confirm = adjust_confirm;
	}

	public String getAdjust_confirm() {
		return adjust_confirm;
	}

	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}

	public String getEngineer() {
		return engineer;
	}

	public void setHole_grade(String hole_grade) {
		this.hole_grade = hole_grade;
	}

	public String getHole_grade() {
		return hole_grade;
	}

	public void setMng_comment(String mng_comment) {
		this.mng_comment = mng_comment;
	}

	public String getMng_comment() {
		return mng_comment;
	}

	public void setGrade_confirm(String grade_confirm) {
		this.grade_confirm = grade_confirm;
	}

	public String getGrade_confirm() {
		return grade_confirm;
	}

	public void setWallrock_phoid(String wallrock_phoid) {
		this.wallrock_phoid = wallrock_phoid;
	}

	public String getWallrock_phoid() {
		return wallrock_phoid;
	}

	public void setCorrode_phoid(String corrode_phoid) {
		this.corrode_phoid = corrode_phoid;
	}

	public String getCorrode_phoid() {
		return corrode_phoid;
	}

	public void setMineralize_phoid(String mineralize_phoid) {
		this.mineralize_phoid = mineralize_phoid;
	}

	public String getMineralize_phoid() {
		return mineralize_phoid;
	}

	public void setOre_phoid(String ore_phoid) {
		this.ore_phoid = ore_phoid;
	}

	public String getOre_phoid() {
		return ore_phoid;
	}

	public void setOre_split_phoid(String ore_split_phoid) {
		this.ore_split_phoid = ore_split_phoid;
	}

	public String getOre_split_phoid() {
		return ore_split_phoid;
	}

	public void setSampling_rate(String sampling_rate) {
		this.sampling_rate = sampling_rate;
	}

	public String getSampling_rate() {
		return sampling_rate;
	}

	public void setGrade_time(Date grade_time) {
		this.grade_time = grade_time;
	}

	public Date getGrade_time() {
		return grade_time;
	}

	public void setSampling_pos(float sampling_pos) {
		this.sampling_pos = sampling_pos;
	}

	public float getSampling_pos() {
		return sampling_pos;
	}

	public void setHole_sta_time(Date hole_sta_time) {
		this.hole_sta_time = hole_sta_time;
	}

	public Date getHole_sta_time() {
		return hole_sta_time;
	}

	public void setCorrode_pos(float corrode_pos) {
		this.corrode_pos = corrode_pos;
	}

	public float getCorrode_pos() {
		return corrode_pos;
	}

	public void setHole_end_time(Date hole_end_time) {
		this.hole_end_time = hole_end_time;
	}

	public Date getHole_end_time() {
		return hole_end_time;
	}

	public void setMineralize_pos(float mineralize_pos) {
		this.mineralize_pos = mineralize_pos;
	}

	public float getMineralize_pos() {
		return mineralize_pos;
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
