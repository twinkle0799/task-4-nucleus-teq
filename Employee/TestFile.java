import java.io.*;
import Data.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String args[]){
        File fileToBeModified = new File("File.txt");

        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter 1 to Add data on file \nEnter 2  to edit the data  \nEnter 3 to delete the data \n4 to see the Content of file :");
        x = sc.nextInt();

        switch(x){
            case(1) :{
                System.out.print("Enter the id of the Employee (Must be less then 5 char) : ");
                String id  = sc.next();
                sc.nextLine();
                System.out.print("Enter the name of the employee (Must be less then 25 char) : ");
                String name = sc.nextLine();
                
               

                System.out.print("Enter Salary of the employee :");
                String salary = sc.next();

                String emp = "";
                for(int i = id.length()-1; i < 6 ; i++){
                    id += " ";
                }
                emp += id;

                for(int i = name.length(); i < 25 ; i++){
                    name += " ";
                }
                emp += name;
                emp += salary;                
                
                AppendData ad = new AppendData();
                ad.append(fileToBeModified, emp);
                break;
            } 
            case(2) : {
                System.out.print("Enter id : ");
                String id = sc.next();
                sc.nextLine();

                System.out.print("Enter change you want : ");
                String change = sc.nextLine();

                System.out.print("Enter string to be replaced :");
                String inPlaceOf = sc.nextLine();

                //System.out.println(change + " "+inPlaceOf);

                UpdateData ud = new UpdateData();
                ud.update(fileToBeModified , id , change , inPlaceOf);
                break;
            }
            case(3) : {
                System.out.print("Enter id to be deleted : ");
                String id =  sc.next();

                DeleteData dd = new DeleteData();
                dd.delete(fileToBeModified, id);
                break;
            }
            case(4) :{
                ShowData sd = new ShowData();
                sd.view(fileToBeModified);
                break;
            }
            default:
                System.out.println("Enter valid Input!");
        }
        //UpdateData ud = new UpdateData();
        //ud.update(fileToBeModified);
        
    }
}
