import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[20];
        int n,min=0,max=0;
        System.out.println("Enter the number of element:");
        n=sc.nextInt();
        System.out.println("Enter the value of array:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if (i==0)
            {
            min=arr[i];
            max=arr[i];}
            else {
                if (min > arr[i])
                    min = arr[i];
                if (max < arr[i])
                    max = arr[i];
            }
        }
        System.out.println("Max value: "+max+"\nMin value: "+min);


    }
}
