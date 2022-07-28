import java.util.*;
public class uservalidation {
    public static void main(String[] args) {
        String oUN="mca";
        String PSWD="kletech";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String un= sc.nextLine();
        System.out.println("Enter Password : ");
        String pswd=sc.nextLine();
        if(un==oUN && PSWD==pswd){
            System.out.println("Login Succsufull!....\n You are authorized user");
        }

        else if(un!=oUN && PSWD==pswd){
            System.out.println("Invalid User Name");
        }

        else if(un==oUN && PSWD!=pswd){
            System.out.println("Invalid Password");
        }
        else {
            System.out.println("Invalid User Name And Password");
        }
        sc.close();
        
    }
    
}
