package com.suixingpay.student.bean;

/**
 * @author Mr.yao
 * @date 2019/11/2 - 20:41
 */
public class Student {
    private String id;
    private String numberId;
    private String name;
    private String gender;
    private String age;
    private String major;
    private String grade;
    private String phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberId() {
        return numberId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberId='" + numberId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
