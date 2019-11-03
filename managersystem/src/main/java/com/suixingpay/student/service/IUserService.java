package com.suixingpay.student.service;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;

/**
 * @author lhx
 * @date 2019/11/3 - 11:45
 */
public interface IUserService {

    /**
     * @author lhx
     * @param user 要查找的用户
     * @return 查找到的用户
     * @throws PcException
     */
    User findByVO(User user) throws PcException;

}
