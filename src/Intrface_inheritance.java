interface interface1{
    void meth1();
    void meth2();
}
interface interface2 extends interface1{
    void meth3();
    void meth4();
}
 class x implements interface2{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class Intrface_inheritance {
    public static void main(String[] args) {
        x o1=new x();
        o1.meth1();
        o1.meth2();
        o1.meth3();
        o1.meth4();
    }
}
