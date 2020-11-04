package com.com.devil.runoob.dataAccessObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class DaoPatternDemo {
    public static void main(String[] args){
        StudentDao studentDao = new StudentDaoImpl();
        for (Student student: studentDao.getAllStudents()){
            System.out.println("Student: rollNo: "+student.getRollNo()+",name: "+student.getName());
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("micheal");
        studentDao.updateStudent(student);

        student = studentDao.getStudent(1);
        System.out.println("Student: rollNo: "+student.getRollNo()+",name: "+student.getName());
    }
}
