package org.example;

import org.example.data.Student;
import org.example.data.report_card.Mark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ImproveMarksBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if (bean instanceof Student && ((Student) bean).getName().equals("Jil")) {
//            if (((Student) bean).getAverageMark() < 3) {
//                double delta = 3 - ((Student) bean).getAverageMark();
//                ((Student) bean).getReportCard().forEach(((subject, mark) -> {
//                    if (mark.getValue() < 5 && mark.getValue() + delta <= 5) {
//                        mark = Mark.values()[mark.ordinal() + (int) delta];
//                }}));
//            }
//        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AFTER"+ beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
