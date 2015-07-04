package com.drilling;

import java.util.Date;

import org.kymjs.kjframe.database.annotate.Id;

/**
 * 
 * @author dell ��׸ſ���
 */
public class DKZtBasicInfo {
	@Id()
	private int id;// PK ��ױ��
	private String holeCode;//
	private String project_id;// fk ���̱��
	private String exploratoryLine;// ��̽��
	private String oreDistrictId;// ������������
	private float holeTopX;// 3 �׿�����x
	private float hole_top_y;// 3 default �׿�����y
	private float hole_top_z;// 3 default �׿�����z
	private float hole_bottom_x;// 3 default �׵�����x
	private float hole_bottom_y;// 3 default �׵�����y
	private float hole_bottom_z;// 3 default �׵�����z
	private float altitude_before;// 3 default �߳�(ƽ��ǰ)
	private float altitude_after;// 3 default �߳�(ƽ����)
	private Date drilling_date;// date default ��������
	private Date sealing_date;// date default �տ�����
	private float azimuth_d;// float 3 default ��λ��(����)
	private float azimuth_s;// float 3 default ��λ��(�տ�)
	private float dipangle_d;// float 3 default ���(����)
	private float dipangle_s;// float 3 default ���(�տ�)
	private float hole_depth_d;// float 3 default ��ƿ���
	private float hole_depth_r;// float 3 default �տ׿���
	private String aim;// varchar2 100 default ʩ��Ŀ��
	private String hole_grade;// varchar2 50 default �������
	private Date work_date;// date default ʩ������
	private Date record_date;// date default ��¼����
	private String record_quality;// varchar2 50 default ��¼����
	private String work_org;// varchar2 50 default ʩ����λ
	private String record_org;// varchar2 50 default ��¼��λ
	private String work_res;// varchar2 200 default ʩ�����
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

	public String getHoleCode() {
		return holeCode;
	}

	public void setHoleCode(String holeCode) {
		this.holeCode = holeCode;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getExploratoryLine() {
		return exploratoryLine;
	}

	public void setExploratoryLine(String exploratoryLine) {
		this.exploratoryLine = exploratoryLine;
	}

	public String getOreDistrictId() {
		return oreDistrictId;
	}

	public void setOreDistrictId(String oreDistrictId) {
		this.oreDistrictId = oreDistrictId;
	}

	public float getHoleTopX() {
		return holeTopX;
	}

	public void setHoleTopX(float holeTopX) {
		this.holeTopX = holeTopX;
	}

	public float getHole_top_y() {
		return hole_top_y;
	}

	public void setHole_top_y(float hole_top_y) {
		this.hole_top_y = hole_top_y;
	}

	public float getHole_top_z() {
		return hole_top_z;
	}

	public void setHole_top_z(float hole_top_z) {
		this.hole_top_z = hole_top_z;
	}

	public float getHole_bottom_x() {
		return hole_bottom_x;
	}

	public void setHole_bottom_x(float hole_bottom_x) {
		this.hole_bottom_x = hole_bottom_x;
	}

	public float getHole_bottom_y() {
		return hole_bottom_y;
	}

	public void setHole_bottom_y(float hole_bottom_y) {
		this.hole_bottom_y = hole_bottom_y;
	}

	public float getHole_bottom_z() {
		return hole_bottom_z;
	}

	public void setHole_bottom_z(float hole_bottom_z) {
		this.hole_bottom_z = hole_bottom_z;
	}

	public float getAltitude_after() {
		return altitude_after;
	}

	public void setAltitude_after(float altitude_after) {
		this.altitude_after = altitude_after;
	}

	public float getAltitude_before() {
		return altitude_before;
	}

	public void setAltitude_before(float altitude_before) {
		this.altitude_before = altitude_before;
	}

	public Date getDrilling_date() {
		return drilling_date;
	}

	public void setDrilling_date(Date drilling_date) {
		this.drilling_date = drilling_date;
	}

	public Date getSealing_date() {
		return sealing_date;
	}

	public void setSealing_date(Date sealing_date) {
		this.sealing_date = sealing_date;
	}

	public float getAzimuth_d() {
		return azimuth_d;
	}

	public void setAzimuth_d(float azimuth_d) {
		this.azimuth_d = azimuth_d;
	}

	public float getAzimuth_s() {
		return azimuth_s;
	}

	public void setAzimuth_s(float azimuth_s) {
		this.azimuth_s = azimuth_s;
	}

	public float getDipangle_d() {
		return dipangle_d;
	}

	public void setDipangle_d(float dipangle_d) {
		this.dipangle_d = dipangle_d;
	}

	public float getDipangle_s() {
		return dipangle_s;
	}

	public void setDipangle_s(float dipangle_s) {
		this.dipangle_s = dipangle_s;
	}

	public float getHole_depth_d() {
		return hole_depth_d;
	}

	public void setHole_depth_d(float hole_depth_d) {
		this.hole_depth_d = hole_depth_d;
	}

	public float getHole_depth_r() {
		return hole_depth_r;
	}

	public void setHole_depth_r(float hole_depth_r) {
		this.hole_depth_r = hole_depth_r;
	}

	public String getAim() {
		return aim;
	}

	public void setAim(String aim) {
		this.aim = aim;
	}

	public String getHole_grade() {
		return hole_grade;
	}

	public void setHole_grade(String hole_grade) {
		this.hole_grade = hole_grade;
	}

	public Date getWork_date() {
		return work_date;
	}

	public void setWork_date(Date work_date) {
		this.work_date = work_date;
	}

	public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRecord_quality() {
		return record_quality;
	}

	public void setRecord_quality(String record_quality) {
		this.record_quality = record_quality;
	}

	public String getWork_org() {
		return work_org;
	}

	public void setWork_org(String work_org) {
		this.work_org = work_org;
	}

	public String getRecord_org() {
		return record_org;
	}

	public void setRecord_org(String record_org) {
		this.record_org = record_org;
	}

	public String getWork_res() {
		return work_res;
	}

	public void setWork_res(String work_res) {
		this.work_res = work_res;
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
