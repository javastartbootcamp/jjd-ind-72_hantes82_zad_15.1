package pl.javastart.task.comparators;

import pl.javastart.task.User;
import java.util.Comparator;

public class LastNameComparator  implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        if (u1.getLastName() == null && u2.getLastName() == null) {
            return 0;
        }
        if (u1.getLastName() == null && u2.getLastName() != null) {
            return -1;
        }
        if (u1.getLastName() != null && u2.getLastName() == null) {
            return 1;
        }
        return (u1.getLastName().compareTo(u2.getLastName()));
    }
}