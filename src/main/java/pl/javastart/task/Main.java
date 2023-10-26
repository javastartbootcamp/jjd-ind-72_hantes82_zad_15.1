package pl.javastart.task;

import pl.javastart.task.exceptions.IncorrectDataException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IncorrectDataException {
        TournamentStats tournamentStats = new TournamentStats();
        Scanner scanner = new Scanner(System.in);
        tournamentStats.run(scanner);
    }

}
