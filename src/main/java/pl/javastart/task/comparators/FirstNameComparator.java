package pl.javastart.task.comparators;

import pl.javastart.task.User;
import java.util.Comparator;

public class FirstNameComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        if ((u1 == null && u2 == null) || (u1.getFirstName() == null && u2.getFirstName() == null)) {
            return 0;
        }
        if ((u1 == null && u2 != null) || (u1.getFirstName() == null && u2.getFirstName() != null)) {
            return -1;
        }
        if ((u1 != null && u2 == null) || (u1.getFirstName() != null && u2.getFirstName() == null)) {
            return 1;
        }
        return (u1.getFirstName().compareTo(u2.getFirstName()));
    }
}

