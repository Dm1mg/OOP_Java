package service;

import model.Group;
import model.Student;
import model.Teacher;

import java.util.List;

public class GroupService {
    private Group group;

    public Group createGroup(Teacher teacher, List<Student> studentList){
        return new Group(teacher, studentList);
    }
}
