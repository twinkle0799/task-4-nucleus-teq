package Data;

import java.io.*;

public class UpdateData {

    public void update(File fileToBeModified , String id , String newString , String oldString){
    

    String newContent = "";
     
    BufferedReader reader = null;
     
    FileWriter writer = null;
     
    try
    {
        reader = new BufferedReader(new FileReader(fileToBeModified));
         
        
         
        String line = reader.readLine();
         
        while (line != null) 
        {   
            String s = line + System.lineSeparator();
            if(s.contains(id)){
                System.out.println("INside update");
                s.replace(oldString, newString);
            }
            newContent = newContent + s;
            line = reader.readLine();
        }
         
        //Replacing oldString with newString in the oldContent
        
       
        writer = new FileWriter(fileToBeModified);
         
        writer.write(newContent);

        writer.close();

        System.out.println("Data is Updated !!!!");
        
       
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
