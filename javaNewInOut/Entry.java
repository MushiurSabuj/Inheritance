package javaNewInOut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Entry {
    public void enter() throws IOException {
        String name= "C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader bob= new FileReader(name);

        int i;
        while((i= bob.read()) !=-1){
            System.out.print((char)i);
        }

    }
}
