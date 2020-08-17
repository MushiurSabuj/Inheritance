package javaNewInOut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public void in() throws IOException {
        String path="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader filepath=new FileReader(path);
        int i;
        while((i= filepath.read()) !=-1){
            System.out.print((char)i);
        }

    }
}
