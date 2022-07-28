public class sbreplace {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("i will write the exam without copying sincerely");
        System.out.println(sb);
        sb.replace(1,5, "Java");
        System.out.println("Replaced : "+sb);


    }
    
}
