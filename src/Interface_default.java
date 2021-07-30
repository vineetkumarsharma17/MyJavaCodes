interface speed1{
    void decrement(int desc);
    void increment(int inc);
}
interface horn1{
    void blowhorn_car();
     default void blow_bike(){ // by default keyword we can create methods in java
         System.out.println("poo poo poo");
     }
}
class cycle1{
    String color="black";
    int model=2013;
    void getinfo(){
        System.out.println("Color is "+color);
        System.out.println("Model is "+model);
    }
}
class AvonCycle1 extends cycle1 implements speed1,horn1{
    public void increment(int inc){
        System.out.println("Speed increment to" +inc);
    }
    public void decrement(int desc){
        System.out.println("Speed decrement to" +desc);
    }
    public void blowhorn_car(){
        System.out.println("pee pee pee");
    }
}
public class Interface_default {
    public static void main(String[] args) {
        AvonCycle1 a=new AvonCycle1();
        a.getinfo();
        a.increment(25);
        a.decrement(5);
        a.blow_bike();
        a.blowhorn_car();
    }
}
