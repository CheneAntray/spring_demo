package com.acorus.spring6.iocxml.diobj;

import java.util.List;

/**
 * ClassName: Department
 * Package: com.acorus.spring6.iocxml.diobj
 * Description: 部门类
 *
 * @Author Saber_991
 * @Create 2023/6/8 14:03
 * @Version 1.0
 */
public class Department {

    private String dname;   //name
    private List<EmpLoyee> empList; //员工集合
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<EmpLoyee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmpLoyee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                ", empList=" + empList +
                '}';
    }
}
