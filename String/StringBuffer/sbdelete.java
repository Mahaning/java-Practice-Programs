public class sbdelete {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello World");
    System.out.println(sb);
    sb.delete(0,6);
    System.out.println("Deleted : "+sb);
    }
}
