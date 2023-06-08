package com.acorus.spring6.iocxml.diobj;

import java.util.Arrays;

/**
 * ClassName: EmpLoyee
 * Package: com.acorus.spring6.iocxml.diobj
 * Description: 员工类
 *
 * @Author Saber_991
 * @Create 2023/6/8 14:04
 * @Version 1.0
 */
public class EmpLoyee {

    private String ename;   //name
    private Integer eage;   //age
    private Department department;  //部门
    private  String[] hobby;    //爱好


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getEage() {
        return eage;
    }

    public void setEage(Integer eage) {
        this.eage = eage;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "EmpLoyee{" +
                "ename='" + ename + '\'' +
                ", eage=" + eage +
                ", department=" + department +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
