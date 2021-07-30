import java.util.Scanner;
public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w1,w2,w3;
        w1="www.google.com";
        w2="www.wapking.in";
        w3="www.tolyymarket.org";
        if(w1.endsWith("com"))
            System.out.println(w1+" is a commercial site.");
        if(w2.endsWith("in"))
            System.out.println(w2+" is a indian site.");
        if(w3.endsWith("org"))
            System.out.println(w3+" is a organization site.");
    }
}
