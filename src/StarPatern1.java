import java.util.Scanner;
public class StarPatern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-i);j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
