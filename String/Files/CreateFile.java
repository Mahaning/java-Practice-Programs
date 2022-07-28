import java.io.*;
class CreateFile{
    public static void main(String[] args) {
        File f= new File("Java.png");
        try{
            boolean value= f.createNewFile();
            if(value){
                System.out.println("File is created");
            }
            else{
                System.out.println("File Allready Exists\n");
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}