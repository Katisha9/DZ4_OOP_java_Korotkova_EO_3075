import java.io.File;
import java.util.Scanner;

public class ReaderService {
    public String path = "Calendar.csv";

    public void getChoice() throws Exception {
                    new ReaderFromCSV(new File(path));
    }

}
