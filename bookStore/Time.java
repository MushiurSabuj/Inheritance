package bookStore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Time {
    public void newYorkTimes() throws IOException {
        String newYork="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader york=new FileReader(newYork);

        int i;
        while((i= york.read()) !=-1)
            System.out.print((char)i);
    }
}
