package Data;
import java.io.*;
public class DeleteData {

    public void delete(File fileToBeModified , String id){
        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

    try
    {
        reader = new BufferedReader(new FileReader(fileToBeModified));

        //Reading all the lines of input text file into oldContent

        String line = reader.readLine();

        while (line != null) 
        {   
            String s = line + System.lineSeparator();
            if(s.contains(id)){
                line = reader.readLine();
                continue;
            }
            oldContent = oldContent + s;

            line = reader.readLine();
        }

        //Replacing oldString with newString in the oldContent


            writer = new FileWriter(fileToBeModified);

            writer.write(oldContent);

            writer.close();

            System.out.println("Employee Data is Deleted !!!!");
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    finally
    {
        try
        {
            //Closing the resources

            reader.close();


        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    }

}