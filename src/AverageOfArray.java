import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[50];
        System.out.println("Enter the number of value:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        float avg;
        avg=(float)sum/n;
        System.out.print("Average of number are:"+avg);
    }
}
