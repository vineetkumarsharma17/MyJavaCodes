import java.util.Scanner;
public class SumFirstEven {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter value of n:");
    int n=sc.nextInt();
    int sum=0;
    for(int i=2;i/2<=n;i=i+2)
    {System.out.print(" "+i);
        sum+=i;
    }
        System.out.println();
    System.out.println("Sum:"+sum);
}
}
