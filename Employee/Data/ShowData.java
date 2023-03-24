package Data;
import java.io.*;

public class ShowData {
    public void view(File f){
        String content = "";

        BufferedReader b = null;

        FileWriter write = null;

        try{
            b = new BufferedReader(new FileReader(f));

            String line = b.readLine();
            while(line != null){
                content = content + line + System.lineSeparator();
                line = b.readLine();
            }

            System.out.println(content);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }    
}
