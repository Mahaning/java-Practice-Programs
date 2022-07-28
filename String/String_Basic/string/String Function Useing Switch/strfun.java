// Name : Mahaning Hubballi
// USN : 01fe21mca038
import java.util.*;
public class strfun{
public static void main(String arg[])
{
    String ch,s1,s2;
    Scanner sc = new Scanner(System.in); 
    while(true){
        
    System.out.println("--------------------------------------------String Functions----------------------------------------");
    System.out.println("Enter string 1 :");
    s1 =sc.nextLine();
    System.out.println("Enter string  2 :");
    s2 =sc.nextLine();
    System.out.println("1.LastIndexOf\n2.charAt\n3.stringcompare\n4.stringconcat\n5.String Endwith\n6.String startwith\n7.String equalsIgnoreCase\n8.indexOf\n9.String Length\n10.String LowerCase\n11.String UpperCase\n12.String Replace\n13.Substring\n14.String Trim");
    ch =sc.nextLine();

    switch(ch){
        case "1":
        System.out.println("Strinng is :\n"+s1);
        System.out.println("Insert char u want index of :");
        String c=sc.nextLine();
        System.out.println(s1.lastIndexOf(c));
        break;

        case "2":
        System.out.println("Strinng is :\n"+s1);
        System.out.println("Index of char u want to know :");
        int i=sc.nextInt();
        System.out.println(s1.charAt(i));
        break;

        case "3":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("String S2 is :\n "+s2);
        int x=s1.compareTo(s2);
        if(x==0)
        System.out.println("equal");
        else
        System.out.println("not equal");
        break;

        case "4":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("String S2 is :\n "+s2);
        String s3=s1.concat(s2);
        System.out.println("Concated string is"+s3);
        break;

        case "5":
        System.out.println("Strinng is :\n"+s1);
        System.out.println("Char value :");
        String s=sc.nextLine();
        System.out.println(s1.endsWith(s));  
        break;

        case "6":
        System.out.println("Strinng is :\n"+s1);
        System.out.println("Char value :");
        String v=sc.nextLine();
        System.out.println(s1.startsWith(v));  
        break;

        case "7":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("String S2 is :\n "+s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        break;

        case "8":
        System.out.println("Strinng is :\n"+s1);
        System.out.println("Insert char u want index of :");
        String cs=sc.nextLine();
        System.out.println(s1.indexOf(cs));
        break;

        case "9":
        System.out.println("Length of string s1 :");
        System.out.println(s1.length());
        break;

        case "10":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("Strinng S2 is :\n"+s2);
        System.out.println("Insert String u want in Lower Case" );
        String cho=sc.nextLine();
        System.out.println(cho.toLowerCase());
        break;

        case "11":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("Strinng S2 is :\n"+s2);
        System.out.println("Insert String u want in Lower Case" );
        String up=sc.nextLine();
        System.out.println(up.toUpperCase());
        break;

        case "12":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("Old Value" );
        String o=sc.nextLine();
        System.out.println("New Value" );
        String n=sc.nextLine();
        System.out.println(s1.replace(o,n));
        break;

        case "13":
        System.out.println("Strinng S1 is :\n"+s1);
        System.out.println("Beganing index Value" );
        int b=sc.nextInt();
        System.out.println("End index Value" );
        int e=sc.nextInt();
        System.out.println(s1.substring(b,e));
        break;

        case "14":
        System.out.println("Length of string s1");
        System.out.println(s1.trim());
        case "15":
        break;
        default : System.out.println("Invalid Choice");

    }
  
}

}
}