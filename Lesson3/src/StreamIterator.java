import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> groupsList;

    public StreamIterator(Stream GroupsList) {
        this.count = 0;
        this.groupsList = GroupsList.getGroupsList();
    }

    @Override
    public boolean hasNext() {
        return count<groupsList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        count++;
        return groupsList.get(count);
    }

    @Override
    public void remove() {
        groupsList.remove(count);
    }
}
