import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> StudentList;

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }


    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }
}
