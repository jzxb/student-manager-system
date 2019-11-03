package com.suixingpay.student.controller;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhx
 * @author lichanghao
 * @date 2019/11/3 - 11:45
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @PostMapping("/login")
    public String loginController(@RequestBody User user) throws PcException {
        User user1 = userService.loginService(user.getUserName());
        if(user1.getPassWord().equals(user.getPassWord())){
            return "登录成功";
        }else {
            return "密码有误";
        }

    }
}
