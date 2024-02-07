package org.example;

import org.example.data.Student;
import org.example.data.report_card.Mark;
import org.example.data.report_card.Subject;
import org.springframework.context.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = {"org.example.data"})
@PropertySources({@PropertySource("classpath:studentIvan.properties"), @PropertySource("classpath:studentSasha.properties")})
public class SpringConfig {

    @Bean
    public Student studentIvan() {
        Map<Subject, Mark> reportCard = new HashMap<>();
        reportCard.put(Subject.ALGEBRA, Mark.GOOD);
        reportCard.put(Subject.COMPUTER_SCIENCE, Mark.GOOD);
        reportCard.put(Subject.ECONOMICS, Mark.GOOD);
        reportCard.put(Subject.GEOMETRY, Mark.GOOD);
        reportCard.put(Subject.PHYSICS, Mark.GOOD);
        reportCard.put(Subject.TECHNICAL_DRAWING, Mark.GOOD);
        return new Student("Ivan", reportCard);
    }

    @Bean
    public Student studentSasha() {
        Map<Subject, Mark> reportCard = new HashMap<>();
        reportCard.put(Subject.ALGEBRA, Mark.GOOD);
        reportCard.put(Subject.COMPUTER_SCIENCE, Mark.GOOD);
        reportCard.put(Subject.ECONOMICS, Mark.GOOD);
        reportCard.put(Subject.GEOMETRY, Mark.GOOD);
        reportCard.put(Subject.PHYSICS, Mark.GOOD);
        reportCard.put(Subject.TECHNICAL_DRAWING, Mark.GOOD);
        return new Student("Sasha", reportCard);
    }

    @Bean
    public Student studentJil() {
        Map<Subject, Mark> reportCard = new HashMap<>();
        reportCard.put(Subject.ALGEBRA, Mark.FAIL);
        reportCard.put(Subject.COMPUTER_SCIENCE, Mark.FAIL);
        reportCard.put(Subject.ECONOMICS, Mark.FAIL);
        reportCard.put(Subject.GEOMETRY, Mark.FAIL);
        reportCard.put(Subject.PHYSICS, Mark.FAIL);
        reportCard.put(Subject.TECHNICAL_DRAWING, Mark.FAIL);
        return new Student("Sasha", reportCard);
    }

}
