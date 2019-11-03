package com.suixingpay.student.service.impl;

import com.suixingpay.student.bean.Student;
import com.suixingpay.student.constants.ExceptionConstants;
import com.suixingpay.student.expection.PcException;
import com.suixingpay.student.mapper.StudentMapper;
import com.suixingpay.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhx
 * @date 2019/11/1 - 16:05
 */
@Service
public class IStudentServiceImpl implements IStudentService, ExceptionConstants {

    @Autowired
    private StudentMapper studentMapper;


    /**
     * 新增对象
     * @author lichanghao
     * @param student 新增对象
     * @throws PcException 抛出的业务异常
     */
    @Override
    public void saveService(Student student) throws PcException {
        studentMapper.save(student);
    }

    /**
     * 根据id更新对象
     * @author lichanghao
     * @param student 要更新的对象
     * @throws PcException 抛出的业务异常
     */
    @Override
    public void updateByIdService(Student student) throws PcException {
        studentMapper.updateById(student);
    }

    /**
     * 根据id删除对象
     * @author lichanghao
     * @param id 要删除的id
     * @throws PcException 抛出的业务异常
     */
    @Override
    public void deleteByIdService(Integer id) throws PcException {
        studentMapper.deleteById(id);
    }


    /**
     * 根据id查找用户
     * @author lichanghao
     * @param id 要查找用户的id
     * @return 查找到的用户
     * @throws PcException 抛出的业务异常
     */
    @Override
    public Student findByIdService(Integer id) throws PcException {
         Student student = studentMapper.findById(id);
         return student;
    }

    /**
     * 根据条件查找用户
     * @author lichanghao
     * @param student 要查找的条件
     * @return 查找到的用户列表
     * @throws PcException 抛出的业务异常
     */
    @Override
    public List<Student> findByVO(Student student) throws PcException {
        if(student == null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "student不能为空！");
        }
        List<Student> list = studentMapper.findByVO(student);
        return list;
    }

    /**
     * 查找所有的用户
     * @author lichanghao
     * @return 返回查到的所有用户
     * @throws PcException 抛出的业务异常
     */
    @Override
    public List<Student> getStudentList() throws PcException {
        List<Student> list = studentMapper.getStudentList();
        return list;
    }

    /**
     * 查找找到的第一条记录
     * @author lichanghao
     * @param student 要查找的条件
     * @return 查找到的用户
     * @throws PcException 抛出业务异常
     */
    @Override
    public Student findFirst(Student student) throws PcException {
        if(student == null){
            throw new PcException(ILLEGAL_ARGUMENT_NULL_ERROR_CODE, "student不能为空！");
        }
        Student s = studentMapper.findFirst(student);
        return s;
    }



    @Override
    public List<Student> findLikeVO(Student student) throws PcException {
        return null;
    }
}
