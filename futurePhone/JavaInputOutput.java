package futurePhone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaInputOutput {
    public void readingFile() throws IOException {
        String filepath="C:\\Users\\mushi\\OneDrive\\javaProject17\\apple\\NewFile.txt";
        FileReader pen= new FileReader(filepath);

        int i;
        while((i= pen.read()) != -1){
            System.out.println((char)i);

        }
    }
}
