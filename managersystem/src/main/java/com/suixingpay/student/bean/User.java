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


    @Override
    public String toString(){
        return "User{" +
                "Id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

}
