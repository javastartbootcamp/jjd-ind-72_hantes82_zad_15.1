package pl.javastart.task.comparators;

import pl.javastart.task.User;
import java.util.Comparator;
import java.util.Objects;

public class ResultComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        Objects.requireNonNull(u1);
        Objects.requireNonNull(u2);
        return Integer.compare(u1.getResult(), u2.getResult());
    }

}
