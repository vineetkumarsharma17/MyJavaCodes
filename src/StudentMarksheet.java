import java.util.Scanner;
public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        int a=s.nextInt();
        if(a<=33)
            System.out.println("you failed in this subject.");
        int b=s.nextInt();
        if(b<=33)
            System.out.println("you failed in this subject.");
        int c=s.nextInt();
        if(c<=33)
            System.out.println("you failed in this subject.");
        float average=(a+b+c)/3;
        if(average<40)
            System.out.println("you failed.");
        else
            System.out.println("you passed");
        System.out.println("total marks:"+(a+b+c)+"\nAverage percentage:"+average);
    }
}
