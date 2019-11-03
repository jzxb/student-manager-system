package com.suixingpay.student.mapper;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lhx
 * @date 2019/11/3 - 13:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testLogin(){
        try {
            User root = userMapper.login("root");
            System.out.println(root);
        } catch (PcException e) {
            e.printStackTrace();
        }
    }
}
