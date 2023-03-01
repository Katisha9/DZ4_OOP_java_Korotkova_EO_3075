
import java.io.File;

public class WriteService {
    public String path = "Calendar.csv";

    public void WriteToCSV() {
        WriteToCSV exp = new WriteToCSV(new File(path));
    }


}
