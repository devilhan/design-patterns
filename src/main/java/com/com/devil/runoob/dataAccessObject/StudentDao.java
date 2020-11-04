package com.com.devil.runoob.dataAccessObject;

import java.util.List;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
