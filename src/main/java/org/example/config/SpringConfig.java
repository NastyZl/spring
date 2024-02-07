package org.example.config;

import org.example.data.Student;
import org.example.data.enums.Mark;
import org.example.data.enums.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.*;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = {"org.example.data"})
@PropertySource("classpath:student.properties")
public class SpringConfig {
    @Bean(initMethod = "init")
    public Student studentJil(@Value("${studentJil.name}") String name,
                              @Value("#{${studentJil.reportCard}}") Map<Subject, Mark> reportCard) {
        return new Student(name, reportCard);
    }

    @Bean(initMethod = "init")
    public Student studentIvan(@Value("${studentIvan.name}") String name,
                               @Value("#{${studentIvan.reportCard}}") Map<Subject, Mark> reportCard) {
        return new Student(name, reportCard);
    }

    @Bean(initMethod = "init")
    public Student studentSasha(@Value("${studentSasha.name}") String name,
                                @Value("#{${studentSasha.reportCard}}") Map<Subject, Mark> reportCard) {
        return new Student(name, reportCard);
    }

    @Bean
    public BeanPostProcessor improveMarksBeanPostProcessor() {
        return new ImproveMarksBeanPostProcessor();
    }

}

