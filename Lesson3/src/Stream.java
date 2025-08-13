import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {
    private List<StudentGroup> GroupsList;

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getGroupsList() {
        return GroupsList;
    }

    public void setGroupsList(List<StudentGroup> groupsList) {
        this.GroupsList = groupsList;

    }

    @Override
    public int compareTo(Stream o) {
        return this.GroupsList.size().compareTo(o.GroupsList.size());//не понимаю почему compareTo не работает
    }
}
