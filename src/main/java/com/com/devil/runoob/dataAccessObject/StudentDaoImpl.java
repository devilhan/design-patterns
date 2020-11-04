package com.com.devil.runoob.dataAccessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        Student student1 = new Student("devil",0);
        Student student2 = new Student("susan",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());

        System.out.println("Student :rollNo is "+student.getRollNo()+",updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: rollNo is "+student.getRollNo()+",deleted from database");
    }
}
