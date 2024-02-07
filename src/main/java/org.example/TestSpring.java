package org.example;

import org.example.data.Student;
import org.example.data.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = contextXml.getBean("teacher", Teacher.class);
        System.out.println("XML: " + teacher);
        for (Student student: teacher.getStudents()) {
            System.out.println(student.getAverageMark());
        }

//        AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Teacher teacher1  = contextJava.getBean("teacher", Teacher.class);
//        System.out.println("JAVA: " + teacher1);
    }
}
