import java.util.Scanner;
public class FindDayName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day number:");
        int n=sc.nextInt();
        switch(n){
            case 1-> System.out.println("monday.");
            case 2-> System.out.println("Tuesday.");
            case 3-> System.out.println("Wednesday.");
            case 4-> System.out.println("Thursday.");
            case 5-> System.out.println("Friday.");
            case 6-> System.out.println("Saturday.");
            case 7-> System.out.println("Sunday.");
            default -> System.out.println("OOps Wrong day number.");
        }
    }
}
