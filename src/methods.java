import java.util.Scanner;


public class methods {
    static int sum(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum="+sum(a,b));
        methods obj=new methods();
        System.out.println("sub="+obj.sub(a,b));

    }
}
