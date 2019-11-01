package com.suixingpay.student.utils;

/**
 * @author lhx
 * @date 2019/11/1 - 15:52
 */
public class UUID {
    public static String getUUID() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}
