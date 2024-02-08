package org.example.config;

import org.example.data.Student;
import org.example.data.enums.Mark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ImproveMarksBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student && ((Student) bean).getName().equals("Jil")) {
            Student student = (Student) bean;
            double averageMark = student.getAverageMark();
            if (averageMark < 3) {
                student.getReportCard().forEach((subject, mark) -> {
                    if (mark == Mark.FAIL) {
                        student.getReportCard().put(subject, Mark.SATISFACTORY);
                    }
                });
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
