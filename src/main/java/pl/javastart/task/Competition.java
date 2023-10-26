package pl.javastart.task;

import pl.javastart.task.comparators.FirstNameComparator;
import pl.javastart.task.comparators.LastNameComparator;
import pl.javastart.task.comparators.ResultComparator;
import pl.javastart.task.exceptions.IncorrectDataException;

import java.util.*;

public class Competition {

    public static List<User> addCompetitors(Scanner scan) throws IncorrectDataException {
        List<User> competitors = new ArrayList<>();
        String line = "continue";
        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            line = scan.nextLine();

            String [] tempArray = line.split(" ");
            if (tempArray.length != 3 && !line.equals("stop")) {
                throw new IncorrectDataException("Podano nieprawidłowe dane");
            } else if (line.equals("stop")) {
                break;
            } else {
                competitors.add(new User(tempArray[0], tempArray[1], Integer.parseInt(tempArray[2])));
            }
        } while (!line.equals("continue"));
        return competitors;
    }

    public static int[] chooseSortMethod(Scanner scanner) {
        scanner = new Scanner(System.in);
        int[] sortType = new int[2];
        do {
            System.out.println("Po jakim parametrze posortować? (1 - imię, 2 - nazwisko, 3 - wynik)");
            sortType[0] = scanner.nextInt();
            scanner.nextLine();
        } while (sortType[0] < 1 || sortType[0] > 3);
        do {
            System.out.println("Sortować rosnąco czy malejąco? (1 - rosnąco, 2 - malejąco)");
            sortType[1] = scanner.nextInt();
            scanner.nextLine();
        } while (sortType[1] < 1 || sortType[1] > 2);
        return sortType;
    }

    public static List<User> sortCompetitors(List<User> competitors, int[]sortMethod) {
        switch (sortMethod[0]) {
            case 1:
                switch (sortMethod[1]) {
                    case 1:
                        Collections.sort(competitors, new FirstNameComparator());
                        break;
                    case 2:
                        Collections.sort(competitors, new FirstNameComparator());
                        Collections.reverse(competitors);
                        break;
                    default:
                        break;
                }
            case 2:
                switch (sortMethod[1]) {
                    case 1:
                        Collections.sort(competitors, new LastNameComparator());
                        break;
                    case 2:
                        Collections.sort(competitors, new LastNameComparator());
                        Collections.reverse(competitors);
                        break;
                    default:
                        break;
                }
            case 3:
                switch (sortMethod[1]) {
                    case 1:
                        Collections.sort(competitors, new ResultComparator());
                        break;
                    case 2:
                        Collections.sort(competitors, new ResultComparator());
                        Collections.reverse(competitors);
                        break;
                    default:
                        break;
                }
        }
        return competitors;
    }
}
