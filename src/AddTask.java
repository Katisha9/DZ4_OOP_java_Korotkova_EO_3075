
import java.time.LocalDate;
import java.util.Scanner;

public class AddTask {
    Scanner sc = new Scanner(System.in);
    Calendar adTask = new Calendar();

    public void addTask() {
        String author;
        String description;
        String priority;
        System.out.println("Введите день дедлайна (YYYY-MM-DD):");
        LocalDate deadline = LocalDate.parse(sc.nextLine());
        System.out.println("Введите ответственного: ");
        author = sc.nextLine();
        System.out.println("Введи описание задачи: ");
        description = sc.nextLine();
        System.out.println("Введите приоритет задачи " +
                "(в-высокий,\n с- средний,\n н - низкий");
        priority = sc.nextLine();
        TaskPriority taskPriority = TaskPriority.valueOf(priority);
        adTask.add(new Task(LocalDate.now(), deadline, author, description, taskPriority));
    }

}
