package ClassJava;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
