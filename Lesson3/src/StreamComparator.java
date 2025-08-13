import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOffComparing = o1.compareTo(o2);
        if (resultOffComparing == 0){
            resultOffComparing = o1.compareTo(o2);
            if (resultOffComparing  == 0){
                return o1.compareTo(o2);
            }else{
                return resultOffComparing;
            }
        }else{
            return resultOffComparing;
        }
    }
}
