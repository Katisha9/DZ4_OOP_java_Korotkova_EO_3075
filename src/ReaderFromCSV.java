

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

public class ReaderFromCSV {

    public ReaderFromCSV(File fName) throws Exception{
        try (Scanner reader = new Scanner(new BufferedReader(new FileReader(fName)))) {

            while (reader.hasNext()) {
                String str = reader.nextLine();
                Calendar readF = new Calendar();
                if (!str.equals("\n")) {
                    String[] stringArray = str.split(";");
                    LocalDate createDate = LocalDate.parse(stringArray[0]);
                    LocalDate deadline = LocalDate.parse(stringArray[1]);
                    String author = stringArray[2];
                    String description = stringArray[3];
                    String priority = stringArray[4];
                    TaskPriority taskPriority = TaskPriority.valueOf(priority);
                    readF.add(new Task(createDate, deadline, author, description, taskPriority));
                                   }
            }
            System.out.println("Список задач загружен");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
