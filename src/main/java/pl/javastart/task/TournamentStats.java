package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectDataException;

import java.util.*;

public class TournamentStats {

    void run(Scanner scanner) throws IncorrectDataException {
        // tutaj dodaj swoje rozwiązanie
        // użyj przekazanego scannera do wczytywania wartości
        List<User> competitors = Competition.addCompetitors(scanner);
        int [] sortMethod = Competition.chooseSortMethod(scanner);
        Competition.sortCompetitors(competitors, sortMethod);
        System.out.println(competitors);
    }
}
