import java.util.Scanner;
public class Calculate_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units:");
        int n= sc.nextInt();
        double amount;
        if(n<=100)
            amount=n*5;
        else if(n<=300)
            amount=500+(n-100)*6.5;
        else
            amount=500+200*6.5+(n-300)*7.5;
        System.out.println("Total payable amount is "+amount);
    }
}
