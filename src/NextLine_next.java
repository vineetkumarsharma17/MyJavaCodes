import java.util.Scanner;
public class NextLine_next {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = s.next();
        System.out.println("Enter Your Age: ");
        int age = s.nextInt();
        System.out.println("Enter Your E-mail: ");
        String email = s.next();
        System.out.println("Enter Your Address: ");
        String address = s.next();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("E-mail: "+email);
        System.out.println("Address: "+address);
    }
}
