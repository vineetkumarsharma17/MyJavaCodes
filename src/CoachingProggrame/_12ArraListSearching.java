package CoachingProggrame;

import java.util.ArrayList;
import java.util.Scanner;

public class _12ArraListSearching {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter value"+i+1+": ");
            a.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            if(isPrime(a.get(i)))
                System.out.println(a.get(i)+"is prime");
        }
    }
    static boolean isPrime(int n){
        int i;
        for( i=2;i<n;i++)
            if(n%i==0)
                break;
        if(n==i)
            return true;
        else
            return false;
    }
}
