import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your income(in lakhs):");
        float i=s.nextFloat();
        float tax;
        if(i>=2.5&&i<=5)
        {
            tax=(float)((i-2.5)*.05);
        }
        else if(i<=10)
        {
            tax=(float)((2.5*.05)+(i-5)*.2);
        }
        else
            tax=(float)((2.5*.05)+(5*.1)+(i-10)*.3);
        System.out.println("tax="+(tax*100000)+"Rs.");
    }
}
