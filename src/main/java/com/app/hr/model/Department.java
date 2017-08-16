package com.app.hr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * 机构
 * @author fz
 * @date  2015-11-3
 */
@Entity
@Table(name="F1_Department")
public class Department {
	@Column(name = "recCreUsrId", length = 30)
	private String recCreUsrId;

	@Column(name = "recCreTm")
	private Date recCreTm;

	@Column(name = "recUpdtUsrId", length = 30)
	private String recUpdtUsrId;

	@Column(name = "recUpdtTm")
	private Date recUpdtTm;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "Seq_F1_Department")
	@Column(name="departmentId")
	private int departmentId;
	
	//部门代码
	@Column(name = "deptCode")
	private String deptCode;
	
	//部门名称
	@Column(name = "deptName")
	private String deptName;
	
	//上级部门
	@Column(name = "parentDeptCode")
	private String parentDeptCode;
	
	//层次
	@Column(name = "level")
	private String level;
	
	//有效标志
	@Column(name = "aliveFlag")
	private boolean aliveFlag;
	
	//标志
	@Column(name = "flag")
	private String flag;
	
	//标志1
	@Column(name = "flag1")
	private String flag1;
	
	//标志2
	@Column(name = "flag2")
	private String flag2;
	
	//标志3
	@Column(name = "flag3")
	private String flag3;
	
	//备注
	@Column(name = "remark")
	private String remark;
	
	//备注1
	@Column(name = "remark1")
	private String remark1;
	
	//备注2
	@Column(name = "remark2")
	private String remark2;
	
	//备注3
	@Column(name = "remark3")
	private String remark3;
	
	
	//备注4
	@Column(name = "remark4")
	private String remark4;
//	@ManyToOne
//	@JoinColumn(name = "parentId")
//	private Department parent;
//	
//	@Transient
//	@OneToMany(mappedBy = "parent",fetch = FetchType.LAZY)
//	private Set<Department> children;


	public String getRecCreUsrId() {
		return recCreUsrId;
	}


	public void setRecCreUsrId(String recCreUsrId) {
		this.recCreUsrId = recCreUsrId;
	}


	public Date getRecCreTm() {
		return recCreTm;
	}


	public void setRecCreTm(Date recCreTm) {
		this.recCreTm = recCreTm;
	}


	public String getRecUpdtUsrId() {
		return recUpdtUsrId;
	}


	public void setRecUpdtUsrId(String recUpdtUsrId) {
		this.recUpdtUsrId = recUpdtUsrId;
	}


	public Date getRecUpdtTm() {
		return recUpdtTm;
	}


	public void setRecUpdtTm(Date recUpdtTm) {
		this.recUpdtTm = recUpdtTm;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDeptCode() {
		return deptCode;
	}


	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getParentDeptCode() {
		return parentDeptCode;
	}


	public void setParentDeptCode(String parentDeptCode) {
		this.parentDeptCode = parentDeptCode;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public boolean isAliveFlag() {
		return aliveFlag;
	}


	public void setAliveFlag(boolean aliveFlag) {
		this.aliveFlag = aliveFlag;
	}


	public String getFlag() {
		return flag;
	}


	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String getFlag1() {
		return flag1;
	}


	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}


	public String getFlag2() {
		return flag2;
	}


	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}


	public String getFlag3() {
		return flag3;
	}


	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getRemark1() {
		return remark1;
	}


	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}


	public String getRemark2() {
		return remark2;
	}


	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}


	public String getRemark3() {
		return remark3;
	}


	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}


	public String getRemark4() {
		return remark4;
	}


	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}
	

	
}
