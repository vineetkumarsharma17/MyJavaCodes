import java.util.Scanner;
public class SumValueOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[5];
        int sum=0;
        System.out.println("Enter five subject marks:");
        for(int i=0;i<marks.length;i++) {
            marks[i] = sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("Sum of values are:"+sum);
    }
}
