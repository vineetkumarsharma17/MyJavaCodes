import java.util.Scanner;
public class ConverToLowerCase {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        String s;
        System.out.print("Enter a String:");
        s=st.nextLine();
        String lw=s.toLowerCase();
        System.out.println("Lower case String:"+lw);
    }
}
