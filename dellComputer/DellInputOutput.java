package dellComputer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DellInputOutput {
    public void inputoutput() throws IOException {
        String filepath = "C:\\Users\\mushi\\OneDrive\\javaProject17\\USA\\Data.txt";
        FileReader myFile = new FileReader(filepath);

        int i;
        while ((i = myFile.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
