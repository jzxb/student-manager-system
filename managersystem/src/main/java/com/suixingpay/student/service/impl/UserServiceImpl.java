package com.suixingpay.student.service.impl;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.constants.ExceptionConstants;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.mapper.UserMapper;
import com.suixingpay.student.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lhx
 * @date 2019/11/3 - 11:46
 */
public class UserServiceImpl implements IUserService, ExceptionConstants {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByVO(User user) throws PcException {
        if(user == null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "user不能为空！");
        }
        User u = userMapper.findByVO(user);
        return u;
    }
}
