package com.com.devil.runoob.transferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StudentBO {
    List<StudentVO> studentVOS;

    public StudentBO() {
        studentVOS = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);

        studentVOS.add(student1);
        studentVOS.add(student2);
    }

    public void deleteStudent(StudentVO studentVO){
        studentVOS.remove(studentVO.getRollNo());
        System.out.println("Student: rollNO: "+studentVO.getRollNo()+",delete from database");
    }

    public List<StudentVO> getAllStudents(){
        return studentVOS;
    }

    public StudentVO getStudent(int rollNO){
        return studentVOS.get(rollNO);
    }

    public void updateStudent(StudentVO studentVO){
        studentVOS.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student: rollNO :"+studentVO.getRollNo()+",updated in the database");
    }
}
