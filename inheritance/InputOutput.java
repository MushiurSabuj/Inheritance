package inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputOutput {
    public void input() throws IOException {
        String filepath = "C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader path = new FileReader(filepath);

        int i;
        while ((i =path.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
