package com.suixingpay.student.mapper;

import com.suixingpay.student.bean.Student;
import com.suixingpay.student.expection.PcException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author lhx
 * @date 2019/11/3 - 15:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {
    
    @Autowired
    StudentMapper studentMapper;
    
    @Test
    public void testFindById() throws PcException {
        Student byId = studentMapper.findById(1);
        System.out.println(byId);
    }

    @Test
    public void testGetStudentList() throws PcException {
        List<Student> studentList = studentMapper.getStudentList();
        System.out.println(studentList);
    }
    
}
