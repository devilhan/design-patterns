package com.com.devil.runoob.transferObject;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args){
        StudentBO studentBO = new StudentBO();

        for (StudentVO stu : studentBO.getAllStudents()){
            System.out.println("Student: [rollNO: "+stu.getRollNo()+",Name: "+stu.getName()+"]");
        }

        StudentVO studentVO = studentBO.getAllStudents().get(0);
        studentVO.setName("new Micheal");
        studentBO.updateStudent(studentVO);

        studentVO = studentBO.getStudent(0);
        System.out.println("Student [ rollNO: "+studentVO.getRollNo()+",name: "+studentVO.getName()+"]");
    }
}
