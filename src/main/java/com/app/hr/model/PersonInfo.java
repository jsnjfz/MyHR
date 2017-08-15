package com.app.hr.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author fz
 * @Date 2017-08-14 18:30
 */

@Entity
public class PersonInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    /** 工号**/
    @Column
    private String empno;

    /** 姓名 **/
    @Column
    private String name;

    /** 昵称**/
    @Column
    private String nickname;

    /** 性别**/
    @Column
    private int sex;

    /** 生日**/
    @Column
    private Date birthday;

    /** 农历生日**/
    @Column
    private Date lunarBirthday;

    /** 年龄**/
    @Column
    private int age;

    /** 学历**/
    @Column
    private int degree;

    /** 婚姻状况**/
    @Column
    private int marriage;

    /** 手机号码**/
    @Column
    private int mobile;

    /** 邮箱**/
    @Column
    private String email;

    /** 现住址**/
    @Column
    private String address;

    /** 身份证号**/
    @Column
    private String idNumber;

    /** 毕业院校**/
    @Column
    private String graduateSchool;

    /** 政治面貌**/
    @Column
    private String politicalExpierence;

    /** 户籍地址**/
    @Column
    private String censusRegisterAddress;

    /** 户籍类型**/
    @Column
    private int censusRegisterType;

    /** 标签**/
    @Column
    private String tags;

    /** QQ号**/
    @Column
    private String qqNum;

    /** 微信号**/
    @Column
    private String weichatNum;

    /** 入职日期**/
    @Column
    private Date joinDate;

    /** 转正日期**/
    @Column
    private Date probationEndDate;

    /** 参加工作时间**/
    @Column
    private Date startWorkDate;

    /** 员工类型**/
    @Column
    private int type;

    /** 状态**/
    @Column
    private int status;

    @CreationTimestamp
    private Date recCreateTime;

    @UpdateTimestamp
    private Date recCreateUser;

    /** 表关联 **/
    @OneToOne
    private ServeStaff serveStaff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLunarBirthday() {
        return lunarBirthday;
    }

    public void setLunarBirthday(Date lunarBirthday) {
        this.lunarBirthday = lunarBirthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getMarriage() {
        return marriage;
    }

    public void setMarriage(int marriage) {
        this.marriage = marriage;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getPoliticalExpierence() {
        return politicalExpierence;
    }

    public void setPoliticalExpierence(String politicalExpierence) {
        this.politicalExpierence = politicalExpierence;
    }

    public String getCensusRegisterAddress() {
        return censusRegisterAddress;
    }

    public void setCensusRegisterAddress(String censusRegisterAddress) {
        this.censusRegisterAddress = censusRegisterAddress;
    }

    public int getCensusRegisterType() {
        return censusRegisterType;
    }

    public void setCensusRegisterType(int censusRegisterType) {
        this.censusRegisterType = censusRegisterType;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getWeichatNum() {
        return weichatNum;
    }

    public void setWeichatNum(String weichatNum) {
        this.weichatNum = weichatNum;
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

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ServeStaff getServeStaff() {
        return serveStaff;
    }

    public void setServeStaff(ServeStaff serveStaff) {
        this.serveStaff = serveStaff;
    }
}
