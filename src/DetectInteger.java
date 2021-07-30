import java.util.Scanner;
//Check whether entered numbr is integer or not
public class DetectInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an integer value:");
        boolean c=s.hasNextInt();
        System.out.println(c);
    }
}
