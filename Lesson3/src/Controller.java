import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String firstName, String lastName, String niddleName){
        studentGroupService.removeStudentByFIO( firstName,  lastName,  niddleName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Stream> getSortedStreamByCount(){
        return streamService.getSortedStreamByCount();
    }
}
