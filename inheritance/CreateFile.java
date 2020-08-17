package inheritance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateFile {
    public void insert() throws IOException {
        String filepath="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader file= new FileReader(filepath);

        int i;
        while((i=file.read()) != -1){
            System.out.print((char)i);
        }

    }
}
