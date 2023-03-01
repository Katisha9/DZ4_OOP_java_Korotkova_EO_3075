
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);



    public static String getValue() {
        System.out.println("Выберите пункт меню: ");
        System.out.println("1-Добавить задачу\n" +
                           "2-Удалить задачу\n" +
                           "3-Загрузить список задач из файла\n" +
                           "4-Записать список задач в файл\n" +
                           "5-Вывести на экран список задач");
        System.out.print("Введите цифру: ");
        return sc.next();
    }

    public static void main(String[] args) throws Exception {

        while (true) {

            switch (getValue()) {
                case ("1"):
                    AddTask addTask = new AddTask();
                    addTask.addTask();
                    break;
                case ("2"):
                    Calendar cal = new Calendar();
                    cal.deleteTask();
                    break;
                case ("3"):
                    ReaderService rs = new ReaderService();
                    rs.getChoice();
                    break;
                case ("4"):
                    WriteService ws = new WriteService();
                    ws.WriteToCSV();
                    break;
                case ("5"):
                    for (Task task : Calendar.getTasks()) {
                        Task.print(task);
                    }
                    break;
                default:
                    System.out.println("Пункт меню введен некорректно");
            }
        }
    }
}


