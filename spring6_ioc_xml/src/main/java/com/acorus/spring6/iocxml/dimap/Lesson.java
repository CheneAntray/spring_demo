package com.acorus.spring6.iocxml.dimap;

/**
 * ClassName: Lesson
 * Package: com.acorus.spring6.iocxml.dimap
 * Description:
 *
 * @Author Saber_991
 * @Create 2023/6/8 17:06
 * @Version 1.0
 */
public class Lesson {

    private String lname;   //name

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lname='" + lname + '\'' +
                '}';
    }
}
