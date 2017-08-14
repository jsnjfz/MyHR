package com.app.hr.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author fz
 * @Date 2017-08-14 20:34
 */

@Entity
public class ServeStaff {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    /** 员工id**/
    public int personId;

    /** 部门id **/
    public int deptId;

    /** 定员类别**/
    public String fixedType;

    /** 岗位id**/
    public int positionId;

    /** 创建时间**/
    public Date recCreateTime;

    /** 创建人**/
    public String recCreateUser;

    /** 修改时间**/
    public Date recUpdateTime;

    /** 修改人**/
    public String recUpdateUser;

    /** 备注**/
    public String remark;

    /** 在职状态**/
    public int status;

    /** 员工类型**/
    public int employeeType;

    /** 工号**/
    public String staffId;

    /** 有效标志**/
    public boolean aliveFlag;
}
