package com.acorus.spring6.iocxml.dimap;

/**
 * ClassName: Teacher
 * Package: com.acorus.spring6.iocxml.dimap
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 16:38
 * @Version 1.0
 */
public class Teacher {

    private String teacherId;
    private String teacherName;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
