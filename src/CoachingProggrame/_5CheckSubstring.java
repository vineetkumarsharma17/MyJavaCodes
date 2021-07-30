package CoachingProggrame;

import java.util.Scanner;

public class _5CheckSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of testcase:");
        int n=sc.nextInt();
        sc.nextLine();
        int count=1,m=0,nt=0;
        while(count<=n)
        {
            System.out.println("==========Testcase: "+count++ +"================");
            System.out.println("Enter string for patern match:");
            String s = sc.nextLine();
            if(s.indexOf("abc")==-1)
            {
                System.out.println("patern not match!");
                nt++;
            }
            else
            {
                System.out.println("patern matched.");
                m++;
            }
        }
        System.out.println(m+" pattern matched and "+nt+" pattern not matched");
    }
}
