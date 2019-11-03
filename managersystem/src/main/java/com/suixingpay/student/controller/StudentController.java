package com.suixingpay.student.controller;

import com.suixingpay.student.bean.Student;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.service.IStudentService;
import com.suixingpay.student.service.impl.IStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lhx
 * @date 2019/11/1 - 15:10
 */
@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    IStudentServiceImpl service;

    /**
     * 查找找到的第一条记录
     * @author lichanghao
     * @param student 要查找的条件
     * @return 查找到的用户
     * @throws PcException 抛出业务异常
     */
    @PostMapping("/add")
    public void addStudentController(@RequestBody Student student){

    }
}
