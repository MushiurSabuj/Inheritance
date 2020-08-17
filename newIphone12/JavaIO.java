package newIphone12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaIO {
    public void readFile() throws IOException {
        //String filepath="C:/Users/mushi/OneDrive/javaProject17/apple/NewFile.txt";
        String filepath="C:\\Users\\mushi\\OneDrive\\javaProject17\\apple\\NewFile.txt";
        FileReader read= new FileReader(filepath);

        int i;
        while((i=read.read()) != -1){
            System.out.print((char)i);
        }

    }
}
