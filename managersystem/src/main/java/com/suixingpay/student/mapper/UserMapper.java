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
     * @author lhx
     * @param user 要查找的用户
     * @return 查找到的用户
     * @throws PcException
     */
    User findByVO(User user) throws PcException;


    /**
     * 登录
     * @author lichanghao
     * @param username
     * @throws PcException
     */
    User login(String username) throws PcException;
}
