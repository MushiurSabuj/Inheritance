package bookStore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Magazine {
    public void oprah() throws IOException {
        String win="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader show=new FileReader(win);

        int i;
        while ((i=show.read()) !=-1){
            System.out.print((char)i);
        }

    }
}
