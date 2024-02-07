package org.example.data;

import org.example.data.report_card.Mark;
import org.example.data.report_card.Subject;

import java.util.Map;

public class Student {
    private String name;
    private Map<Subject, Mark> reportCard;

    public Map<Subject, Mark> getReportCard() {
        return reportCard;
    }

    private boolean isEnrolled = false;

    public Student(String name, Map<Subject, Mark> reportCard) {
        this.name = name;
        this.reportCard = reportCard;
    }

    public String getName() {
        return name;
    }

    public void setReportCard(Map<Subject, Mark> reportCard) {
        this.reportCard = reportCard;
    }

    public void init() {
        this.isEnrolled = this.getAverageMark() > Mark.SATISFACTORY.getValue();
    }

    public Double getAverageMark() {
        return reportCard.values().stream()
                .mapToDouble(Mark::getValue)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", reportCard=" + reportCard +
                ", isEnrolled=" + isEnrolled +
                '}';
    }
}
