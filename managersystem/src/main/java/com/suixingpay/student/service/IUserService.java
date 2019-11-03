package com.suixingpay.student.service;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;
import org.springframework.stereotype.Service;

/**
 * @author lhx
 * @date 2019/11/3 - 11:45
 */
public interface IUserService {

    /**
     * 登录
     * @author lichanghao
     * @param username
     * @return User对象
     * @throws PcException
     */
    User loginService(String username) throws PcException;

}
