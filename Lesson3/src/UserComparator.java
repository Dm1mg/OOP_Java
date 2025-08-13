import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOffComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOffComparing == 0){
            resultOffComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOffComparing  == 0){
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            }else{
                return resultOffComparing;
            }
        }else{
            return resultOffComparing;
        }
    }
}
