package futurePhone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InsertUpdate {
    public void gang() throws IOException {
        String r="C:\\Users\\mushi\\OneDrive\\javaProject17\\JavaDirectory\\Directory.txt";
        FileReader c= new FileReader(r);
        int i;
        while((i=c.read()) !=-1){
            System.out.println((char)i);
        }
    }
}
