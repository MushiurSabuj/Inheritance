package javaNewInOut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mango {
    public void fileReading() throws IOException {
        String filepath="C:\\Users\\mushi\\OneDrive\\javaProject17\\USA\\Data.txt";
        FileReader callingFile= new FileReader(filepath);

        int i;
        while((i =callingFile.read()) != -1){
            System.out.print((char)i);

        }

    }
}
