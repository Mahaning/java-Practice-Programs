import java.io.*;
import java.util.Scanner;
public class WriteFile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter File Name With Extention :");
        String fn=sc.nextLine();
        System.out.println("Enter File Data :");
        String in=sc.nextLine();
        try{
            FileWriter output= new FileWriter(fn);
            output.write(in);
            System.out.println("Data enterd Succsusfully!......");
            output.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
    
}
