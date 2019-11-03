package com.suixingpay.student.controller;

import com.suixingpay.student.bean.User;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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


    @RequestMapping("/login")
    public String loginController(@RequestParam("username")String username, @RequestParam("password")String password, HttpServletRequest request) throws PcException {
        System.out.println("登录验证");
        User user1 = userService.loginService(username);
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        if(user1.getPassWord().equals(password)){
            return "登录成功";
        }else {
            throw  new PcException("ILLEGAL_ARGUMENT_NULL_ERROR_CODE","密码错误");
        }

    }
}
