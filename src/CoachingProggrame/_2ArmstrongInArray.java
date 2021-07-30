package CoachingProggrame;

import java.util.Scanner;

public class _2ArmstrongInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter value:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int tmp=arr[i];
            int arm=0;
            while(tmp!=0){
                int r=tmp%10;
                arm+=r*r*r;
                tmp/=10;
            }
            if(arm==arr[i])
                System.out.println(arr[i]+" is armstrong");
        }
    }
}
