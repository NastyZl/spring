package org.example.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Teacher {
    private List<Student> students;

    public Teacher(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "students=" + students +
                '}';
    }
}
