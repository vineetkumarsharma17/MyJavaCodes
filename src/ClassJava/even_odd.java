package ClassJava;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a % 4 == 0)
            System.out.println("Leap year");
        else System.out.println("not leap year");

    }
}