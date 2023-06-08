package com.acorus.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * ClassName: Student
 * Package: com.acorus.spring6.iocxml.dimap
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 16:38
 * @Version 1.0
 */
public class Student {

    private String sid; //id
    private String sname;   //name
    private Map<String,Teacher> teacherMap;
    private List<Lesson> ls;    //lessons

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLs() {
        return ls;
    }

    public void setLs(List<Lesson> ls) {
        this.ls = ls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", teacherMap=" + teacherMap +
                ", ls=" + ls +
                '}';
    }
}
