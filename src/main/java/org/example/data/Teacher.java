package org.example.data;

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
