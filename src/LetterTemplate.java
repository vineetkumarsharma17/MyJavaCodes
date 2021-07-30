import java.util.Scanner;
public class LetterTemplate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="Dear <|name|> Thanks a lot!";
        System.out.println(str);
        System.out.println("Enter your name:");
        String name=s.nextLine();
        str = str.replace("<|name|>",name);
        System.out.println(str);


    }
}
