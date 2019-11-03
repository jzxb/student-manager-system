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
    private String username;
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return username;
    }

    public String getPassWord() {
        return password;
    }

    @Override
    public String toString(){
        return "User{" +
                "Id='" + id + '\'' +
                ", userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                '}';
    }

}
