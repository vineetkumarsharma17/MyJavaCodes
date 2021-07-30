package CoachingProggrame;

import java.util.Scanner;

public class _1CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i;
        for( i=2;i<n;i++)
            if(n%i==0)
                break;

            if(n==i)
                System.out.println(n+" is prime.");
            else
                System.out.println(n+" is not prime");
    }
}
