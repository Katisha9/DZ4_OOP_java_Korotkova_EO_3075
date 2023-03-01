
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToCSV {
    public WriteToCSV(File file) {

        try (FileWriter fr = new FileWriter(file, false)) {
            StringBuilder strBuilder = new StringBuilder();
            Calendar writeTo = new Calendar();
            for (Task task : writeTo.getTasks()) {
                strBuilder.append(task.getCreateDate());
                strBuilder.append(";");
                strBuilder.append(task.getDeadline());
                strBuilder.append(";");
                strBuilder.append(task.getAuthor());
                strBuilder.append(";");
                strBuilder.append(task.getDescription());
                strBuilder.append(";");
                strBuilder.append(task.getTaskPriority());
                strBuilder.append("\n");
            }
            fr.append(strBuilder.toString());
            System.out.println("Задача сохранена в файл, нажмите 5, чтобы посмотреть все задачи");
        } catch (IOException e) {
            System.out.printf("Ошибка записи! %s", e);
        }
    }

}
