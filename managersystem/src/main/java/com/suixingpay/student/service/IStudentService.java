package com.suixingpay.student.service;

import com.suixingpay.student.bean.Student;
import com.suixingpay.student.expection.PcException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhx
 * @date 2019/11/1 - 15:46
 */
public interface IStudentService {

    /**
     * 新增对象
     * @author lichanghao
     * @param student 新增对象
     * @throws PcException 抛出的业务异常
     */
    void saveService(Student student) throws PcException;


    /**
     * 根据id更新对象
     * @author lichanghao
     * @param student 要更新的对象
     * @throws PcException 抛出的业务异常
     */
    void updateByIdService(Student student) throws PcException;

    /**
     * 根据id删除对象
     * @author lichanghao
     * @param id 要删除的id
     * @throws PcException 抛出的业务异常
     */
    void deleteByIdService(Integer id) throws PcException;

    /**
     * 根据id查找用户
     * @author lichanghao
     * @param id 要查找用户的id
     * @return 查找到的用户
     * @throws PcException 抛出的业务异常
     */
    Student findByIdService(Integer id) throws PcException;

    /**
     * 根据条件查找用户
     * @author lichanghao
     * @param student 要查找的条件
     * @return 查找到的用户列表
     * @throws PcException 抛出的业务异常
     */
    List<Student> findByVO(Student student) throws PcException;

    /**
     * 查找所有的用户
     * @author lichanghao
     * @return 返回查到的所有用户列表
     * @throws PcException 抛出的业务异常
     */
    List<Student> getStudentList() throws PcException;

    /**
     * 查找找到的第一条记录
     * @author lichanghao
     * @param student 要查找的条件
     * @return 查找到的用户
     * @throws PcException 抛出业务异常
     */
    Student findFirst(Student student) throws PcException;

    /**
     * 模糊查询
     */
    List<Student> findLikeVO(Student student) throws PcException;


}
