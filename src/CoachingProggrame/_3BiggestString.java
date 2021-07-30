package CoachingProggrame;

import java.util.Scanner;

public class _3BiggestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

      String  n[]=s.split(" ");
       String max=n[0];
                for(int i=1;i<n.length;i++){
                    if(max.length()<n[i].length())
                    {
                        max=n[i];
                    }
                }
        System.out.println(max);
    }
}
