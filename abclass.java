//abstract class
abstract class p{
    //abstract method
    public abstract void abstractdisp();
    // public abstract void abstractdis1();
    public void pdisp(){
        System.out.println("Parent class");

    }
}

class c  extends p{
    public void abstractdisp(){
        System.out.println("Chaild c  abstractdisp");
    }
    
}
class c2 extends c{
    public void abstractdisp(){
        System.out.println("Chaild c2  abstractdisp");
    }
}
class abclass{
    public static void main(String[] args) {
        c2 o=new c2();
        c o1=new c();
        o.abstractdisp();
        o1.abstractdisp();
        o.pdisp();
    }
}