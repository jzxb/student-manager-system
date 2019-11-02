package com.suixingpay.student.bean;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @author Mr.yao
 * @date 2019/11/2 - 22:41
 */
public class Student {
    @Id
    @GeneratedValue
    private String number_id;
    @NotEmpty
    private String name;
    private String sex;
    private String age;
    private String major;
    private String grade;
    private String phone_number;

    public String getNumber_id() {
        return number_id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getGrade() {
        return grade;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setNumber_id(String number_id) {
        this.number_id = number_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
