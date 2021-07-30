package CoachingProggrame;

import java.util.Scanner;
public class _7HexaToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hexadecimal number");
        String hex=sc.next();
        System.out.println("Hexadecimal="+hex);
        System.out.print("Binary =");
        for(int i=0;i<hex.length();i++){
            char c=hex.charAt(i);
            int n;
            switch (c){
                case 'A':n=10;break;
                case 'B':n=11;break;
                case 'C':n=12;break;
                case 'D':n=13;break;
                case 'E':n=14;break;
                case 'F':n=15;break;
                default:n=c-'0';
            }
            int j,r;
            char []b=new char[4];
            for (j=3;j>=0;j--){
                r=n%2;
                b[j]=(char)(r+'0');
                n=(int) (n/2);
            }
            for(j=0;j<4;j++)
                System.out.print(b[j]);

        }
    }
}
