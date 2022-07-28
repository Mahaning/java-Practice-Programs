import java.util.*;
public class strfun {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("String Functions Using switch Case");
	System.out.println("1:UpperCase 2:LowerCase 3:Trim");
	System.out.println("Enter your Choice ");
	int ch=sc.nextInt();
switch(ch)
{
case 1: System.out.println("Enter the String in LowerCase "); 
        Scanner s1=new Scanner(System.in);
		String i=s1.nextLine();
		System.out.println(i.toUpperCase());
       break; 
case 2:  System.out.println("Enter the String in UpperCase"); 
         Scanner s2=new Scanner(System.in);
		 String l=s2.nextLine();
		 System.out.println(l.toLowerCase());
         break;

case 3:System.out.println("Enter the String "); 
        Scanner s3=new Scanner(System.in);
        String tr=s3.nextLine();
        System.out.println(tr.trim());
       break;


	   
default:System.out.println("Invalid option");
}
}
}
    
