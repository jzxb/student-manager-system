package com.suixingpay.student.bean;


import lombok.Getter;
import lombok.Setter;

/**
 * @author lichanghao
 * @date 2019/11/3 - 10:08
 */


@Getter
@Setter
public class User {
    private int id;
    private String userName;
    private String passWord;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString(){
        return "User{" +
                "Id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

}
