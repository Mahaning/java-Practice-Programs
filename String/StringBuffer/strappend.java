class strappend{
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello");
        System.out.println(sb);
        sb.append(" Java Program");//add at end of the string
        System.out.println(sb);
        sb.reverse();//revrse the string
        System.out.println("Reverse Str "+sb);
        sb.insert(6, "for");
        System.out.println("INserting "+sb);


    }
}
