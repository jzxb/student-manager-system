package com.suixingpay.student.service.impl;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.constants.ExceptionConstants;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.mapper.UserMapper;
import com.suixingpay.student.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhx
 * @date 2019/11/3 - 11:46
 */
@Service
public class UserServiceImpl implements IUserService, ExceptionConstants {

    @Autowired
    UserMapper userMapper;

    @Override
    public User loginService(String username) throws PcException {
        if(username==null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "用户名不能为空！");
        }
        if(userMapper.login(username)==null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "用户名不存在");
        }
        User user = userMapper.login(username);
        return user;
    }
}
