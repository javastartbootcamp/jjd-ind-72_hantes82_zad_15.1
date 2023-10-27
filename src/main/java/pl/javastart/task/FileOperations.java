package pl.javastart.task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOperations {
    public static void writeToFile(List<User> competitors, String filePath) {

        try (
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (User user : competitors) {
                String line = user.getFirstName() + " " + user.getLastName() + ";" + user.getResult();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("File does not exist");
        }

        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
    }
}
