package com.com.devil.runoob.MVC;

/**
 * @author Hanyanjiao
 * @date 2020/11/4
 */
public class MVCPatternDemo {
    public static void main(String[] args){
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();
        controller.setStudenRollNo("10");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("devil");
        student.setRollNo("1");
        return student;
    }
}
