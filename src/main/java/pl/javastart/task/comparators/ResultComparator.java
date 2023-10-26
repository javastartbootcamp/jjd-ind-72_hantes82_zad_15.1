package pl.javastart.task.comparators;

import pl.javastart.task.User;

import java.util.Comparator;

public class ResultComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        if (u1 == null && u2 == null) {
            return 0;
        }
        if (u1 == null && u2 != null) {
            return -1;
        }
        if (u1 != null && u2 == null) {
            return 1;
        }

        return Integer.compare(u1.getResult(), u2.getResult());
    }

}
