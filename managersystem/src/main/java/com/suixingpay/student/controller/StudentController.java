package com.suixingpay.student.controller;

import com.suixingpay.student.bean.Student;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.service.IStudentService;
import com.suixingpay.student.service.impl.IStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.suixingpay.student.constants.ExceptionConstants.ILLEGAL_ARGUMENT_NULL_ERROR_CODE;

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
     * 列出所有学生信息
     * @return 所有学生信息
     * @throws PcException
     */
    @RequestMapping("/list")
    public List<Student> list() throws PcException {
        List<Student> list = service.getStudentList();
        return list;
    }

    /**
     * 显示添加学生信息的页面
     */
    @RequestMapping("/showAdd")
    public String showAdd(){
        return "Student/showAdd";
    }

    /**
     * 添加功能实现，将输入的学生信息添加到数据库中
     * @param student
     * @return
     * @throws PcException
     */
    @RequestMapping("/add")
    public String addStudentController(@RequestBody Student student) throws PcException {
        if(student ==null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "用户为空");
        }
        service.saveService(student);
        return "添加成功";
    }

    /**
     * 删除学生信息，删除后直接刷新，不需要确认
     * @param id
     * @return
     * @throws PcException
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) throws PcException {
        service.deleteByIdService(id);
        return "删除成功";
    }

    /**
     * 显示修改学生信息的界面
     * @param id
     * @param map
     * @return
     * @throws PcException
     */
    @RequestMapping("/showUpdate/{id}")
    public String showUpdate (@PathVariable("id")Integer id, Map map) throws PcException {
        Student t = service.findByIdService(id);
        map.put("student",t);
        return "显示修改";
    }

    /**
     * 修改功能实现，将修改的信息加入数据库
     * @param student
     * @return
     * @throws PcException
     */
    @RequestMapping("/update")
    public String update(Student student) throws PcException {
        service.updateByIdService(student);
        return "修改成功";
    }

    /**
     * 显示 查找的某名学生的信息 的界面
     * @param id
     * @param map
     * @return
     * @throws PcException
     */
    @RequestMapping("/showStudent/{id}")
    public  String findById(@PathVariable("id")Integer id,Map map) throws PcException {
        Student t = service.findByIdService(id);
        map.put("student",t);
        return "查询学生";
    }

}
