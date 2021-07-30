import java.util.Scanner;
public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st;
        System.out.println("Enter a String:");
        st=s.nextLine();
        System.out.println(st.replace(' ','_'));
    }
}
