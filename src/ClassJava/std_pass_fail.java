package ClassJava;

import java.util.Scanner;

public class std_pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        int a=sc.nextInt();//a=45
        int b=sc.nextInt();//b=18
        int c=sc.nextInt();//c=68
        if(a<33)
            System.out.println("Fail");
        else if(b<33)
            System.out.println("Fail");
        else if(c<33)
            System.out.println("Fail");
        else {//158/300==0.7478
            int t=a+b+c;
            float per=(float)t/300*100;
            if(per>=40)
                System.out.println("Pass");
            else
                System.out.println("Fail");
        }

}}
