import java.util.Scanner;
public class DetectSpace
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=s.nextLine();
        int l=str.indexOf("  ");
        System.out.println(l);

    }
}
