package ClassJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ch03_opearator {
    //unary operator ++,--
    //arithmetic operator
    //bitwise   &,|,>>,<< ,~,^
    //relational  <,>,<=,>=,==,!=
    //logical   &&,||,!
    //assignment =.+=,-=,*=,
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");

        float b=sc.nextFloat();
        boolean bl=sc.nextBoolean();
       // String str=sc.next();//read only one word
        int a=sc.nextInt();
        sc.nextLine();
        String str1=sc.nextLine();// read multiple word
        System.out.println(a);
        System.out.println(b);
        System.out.println(bl);
        //System.out.println(str);
        System.out.println(str1);
    }

}
