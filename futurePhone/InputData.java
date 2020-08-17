package futurePhone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputData {
    public void data() throws IOException {
        String ron = "C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader don = new FileReader(ron);

        int i;
        while((i = don.read()) != -1){
            System.out.print((char)i);
        }
    }
}
