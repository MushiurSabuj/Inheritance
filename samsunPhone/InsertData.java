package samsunPhone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InsertData {
    public void info() throws IOException {
        String nem="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader you=new FileReader(nem);

        int i;
        while((i= you.read()) !=-1){
            System.out.print((char)i);
        }

    }
}
