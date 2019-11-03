package com.suixingpay.student.mapper;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lhx
 * @date 2019/11/3 - 11:46
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 登录
     * @author lichanghao
     * @param username
     * @throws PcException
     */
    User login(String username) throws PcException;
}
