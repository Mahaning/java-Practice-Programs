public class sbinsert {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Good Day");
        System.out.println(sb);
        // sb.append(" ");//add at end of the string
        sb.insert(6, "123");//insert value at pos 6
        System.out.println("INserting "+sb);


    }
    
}
