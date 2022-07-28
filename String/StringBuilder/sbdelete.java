public class sbdelete {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Programming");
    System.out.println(sb);
    sb.delete(1,3);
    System.out.println("Replaced : "+sb);
    }
}
