package com.app.hr.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author fz
 * @Date 2017-08-14 20:34
 */

@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int employeeId;

    /** 工号**/
    @Column
    private String empNo;

    /** 定员类别**/
    @Column
    public String fixedType;

    /** 岗位id**/
    //以后改为与岗位关系public int positionId;

    /** 入职日期**/
    @Column
    private Date joinDate;

    /** 转正日期**/
    @Column
    private Date probationEndDate;

    /** 在职状态**/
    @Column
    public int status;

    /** 员工类型**/
    @Column
    public int employeeType;

    /** 备注**/
    @Column
    public String remark;

    /** 有效标志**/
    @Column
    public boolean aliveFlag;

    /** 创建时间**/
    @CreationTimestamp
    public Date recCreateTime;

    /** 修改时间**/
    @UpdateTimestamp
    public Date recUpdateTime;

    /**表关联关系**/
    @OneToOne
    private PersonInfo personInfo;

    @OneToOne
    private Department department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getFixedType() {
        return fixedType;
    }

    public void setFixedType(String fixedType) {
        this.fixedType = fixedType;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getProbationEndDate() {
        return probationEndDate;
    }

    public void setProbationEndDate(Date probationEndDate) {
        this.probationEndDate = probationEndDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isAliveFlag() {
        return aliveFlag;
    }

    public void setAliveFlag(boolean aliveFlag) {
        this.aliveFlag = aliveFlag;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
