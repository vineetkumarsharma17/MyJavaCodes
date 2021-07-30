
abstract class area{
    int l,b,r;
    area(int l,int b){
        this.b=b;
        this.l=l;
    }
    area(int r){
        this.r=r;
    }
    abstract int area1();
    void show(){
        System.out.println("This is abstract class method show");
    }
}
class rect extends area{
   // int l,b;
    rect(int l,int b){
        super (l,b);
    }
    @Override
    int area1() {
        return (l*b);
    }
}
class circle extends area{

    circle(int r)
    {
        super(r);
    }
    int area1(){
        return (22*r*r/7);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        rect r=new rect(5,10);
        System.out.println("Area of rect is "+r.area1());
        circle c=new circle(7);
        System.out.println("Area of circle is "+c.area1());
    }
}
