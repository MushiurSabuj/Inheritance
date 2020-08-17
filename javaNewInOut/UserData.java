package javaNewInOut;

import java.io.FileReader;
import java.io.IOException;

public class UserData {
    public void user() throws IOException {
        String data="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader file= new FileReader(data);
        int i;
        while((i=file.read()) !=-1){
            System.out.print((char)i);
        }
    }
}
