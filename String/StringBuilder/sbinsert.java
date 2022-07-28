public class sbinsert {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" Java Program");//add at end of the string
        sb.insert(6, "for");//insert value at pos 6
        System.out.println("INserting "+sb);


    }
    
}
