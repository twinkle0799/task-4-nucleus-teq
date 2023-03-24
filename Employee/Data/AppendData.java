package Data;
import java.io.*;
public class AppendData {

    public void append(File path , String text){
        try {
            text += System.lineSeparator();
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            System.out.println("New Employee Added !!");
            fw.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    
}
