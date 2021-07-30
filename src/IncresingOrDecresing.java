/*Write a program that accepts three numbers from the user
        and prints "increasing" if the numbers are in increasing order,
        "decreasing" if the numbers are in decreasing order,
        and "Neither increasing or decreasing order" otherwise.*/
import java.util.Scanner;
public class IncresingOrDecresing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a=s.nextInt();
        System.out.println("Enter number 2: ");
        int b=s.nextInt();
        System.out.println("Enter number 3: ");
        int c=s.nextInt();
        if (a>b&&b>c)
            System.out.println("Entered Numbers are Decresing Order.");
        else if (c>b&&b>a)
            System.out.println("Entered Numbers are Incresing Order.");
        else
            System.out.println("Entered Numbers are neither Incresing Nor Decresing Order.");
    }
}
