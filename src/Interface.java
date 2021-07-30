interface speed{
    void decrement(int desc);
    void increment(int inc);
}
interface horn{
    void blowhorn_car();
    void blow_bike();
}
class cycle{
    String color="black";
    int model=2013;
    void getinfo(){
        System.out.println("Color is "+color);
        System.out.println("Model is "+model);
    }
}
class AvonCycle extends cycle implements speed,horn{
    public void increment(int inc){
        System.out.println("Speed increment to" +inc);
    }
    public void decrement(int desc){
        System.out.println("Speed decrement to" +desc);
    }
    public void blowhorn_car(){
        System.out.println("pee pee pee");
    }
    public void blow_bike(){
        System.out.println("poo poo poo");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle a=new AvonCycle();
        a.getinfo();
        a.increment(25);
        a.decrement(5);
        a.blow_bike();
        a.blowhorn_car();
    }
}
