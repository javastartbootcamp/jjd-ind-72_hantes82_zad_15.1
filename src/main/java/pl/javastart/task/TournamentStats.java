package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectDataException;

import java.util.*;

public class TournamentStats {

    void run(Scanner scanner) {
        // tutaj dodaj swoje rozwiązanie
        // użyj przekazanego scannera do wczytywania wartości
        try {
            String filePath = "stats.csv";
            List<User> competitors = Competition.addCompetitors(scanner);
            Comparator<User> sortMethod = Competition.chooseSortMethod(scanner);
            competitors.sort(sortMethod);
            FileOperations.writeToFile(competitors, filePath);
        } catch (IncorrectDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
