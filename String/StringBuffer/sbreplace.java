public class sbreplace {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("i will write the exam without copying sincerely");
        System.out.println(sb);
        sb.replace(1,5, "Java");
        System.out.println("Replaced : "+sb);


    }
    
}
