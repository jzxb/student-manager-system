package com.suixingpay.student.mapper;

import com.suixingpay.student.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lhx
 * @date 2019/11/1 - 15:12
 */
@Mapper
@Repository
public interface StudentMapper {

    boolean save(Student student);

    List<Student> getStudentList();
}
