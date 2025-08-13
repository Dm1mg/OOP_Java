import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream Stream;
    public List<Stream> getSortedStreamByCount(){
        List<Stream> streams = new ArrayList<>();
        Collections.sort(streams, new StreamComparator());
        return streams;
    }
}
