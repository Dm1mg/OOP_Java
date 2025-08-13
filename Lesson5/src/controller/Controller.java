package controller;

import model.*;
import service.DataService;
import service.GroupService;
import view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final GroupService groupService = new GroupService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.TEACHER);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }



    public void createGroup(Teacher teacher, List<Student> studentList){
        groupService.createGroup(teacher, studentList);
    }
}
