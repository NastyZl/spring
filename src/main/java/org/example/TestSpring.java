package org.example;

import org.example.config.SpringConfig;
import org.example.data.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacherXml = contextXml.getBean("teacher", Teacher.class);
        teacherXml.getStudents().forEach(System.out::println);

        AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(SpringConfig.class);
        Teacher teacherJava = contextJava.getBean("teacher", Teacher.class);
        teacherJava.getStudents().forEach(System.out::println);

    }
}
