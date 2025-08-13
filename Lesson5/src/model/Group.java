package model;

import java.util.List;

public class Group {
    private Teacher teacher;
    private List<Student> Students;

    public Group(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        Students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }
}
