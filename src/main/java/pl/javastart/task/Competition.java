package pl.javastart.task;

import pl.javastart.task.comparators.FirstNameComparator;
import pl.javastart.task.comparators.LastNameComparator;
import pl.javastart.task.comparators.ResultComparator;
import pl.javastart.task.exceptions.IncorrectDataException;

import java.util.*;

public class Competition {
    static final int FIRST_NAME_SORT = 1;
    static final int LAST_NAME_SORT = 2;
    static final int RESULT_SORT = 3;
    static final int ASCENDING = 1;
    static final int DESCENDING = 2;

    public static List<User> addCompetitors(Scanner scan) throws IncorrectDataException {
        List<User> competitors = new ArrayList<>();
        String line = "continue";
        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            line = scan.nextLine();
            String [] tempArray = line.split(" ");
            if (tempArray.length != 3 && !line.equalsIgnoreCase("stop")) {
                throw new IncorrectDataException("Podano nieprawidłowe dane");
            } else if (line.equalsIgnoreCase("stop")) {
                break;
            } else {
                competitors.add(new User(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2])));
            }
        } while (!line.equalsIgnoreCase("stop"));
        return competitors;
    }

    public static Comparator<User> chooseSortMethod(Scanner scanner) {
        int sortType;
        do {
            System.out.println("Po jakim parametrze posortować? (1 - imię, 2 - nazwisko, 3 - wynik)");
            sortType = scanner.nextInt();
            scanner.nextLine();
        } while (sortType < FIRST_NAME_SORT || sortType > RESULT_SORT);
        Comparator<User> comparator = switch (sortType) {
            case FIRST_NAME_SORT -> new FirstNameComparator();
            case LAST_NAME_SORT -> new LastNameComparator();
            default -> new ResultComparator();
        };

        int sortOrder;

        do {
            System.out.println("Sortować rosnąco czy malejąco? (1 - rosnąco, 2 - malejąco)");
            sortOrder = scanner.nextInt();
            scanner.nextLine();
        } while (sortOrder  < ASCENDING || sortOrder  > DESCENDING);
        if (sortOrder == DESCENDING) {
            Comparator<User> comparatorReversed = comparator.reversed();
            return comparatorReversed;
        }
        return comparator;
    }
}
