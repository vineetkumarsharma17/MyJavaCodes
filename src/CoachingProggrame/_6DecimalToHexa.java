package CoachingProggrame;

import java.util.Scanner;

public class _6DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int num=sc.nextInt();
        int tmp=num;
        int p=0,rem;
        char[]hex=new char[30];

        while(num!=0){
            rem=num%16;
            switch(rem){
                case 10:hex[p++]='A';break;
                case 11:hex[p++]='B';break;
                case 12:hex[p++]='C';break;
                case 13:hex[p++]='D';break;
                case 14:hex[p++]='E';break;
                case 15:hex[p++]='F';break;
                default:hex[p++]=(char)(rem+'0');
            }
//            hex+=num%16*Math.pow(10,p++);
            num=(int)(num/16);
        }
        System.out.println("Decimal="+tmp);
        for(int i=p-1;i>=0;i--){
            System.out.print(hex[i]);
        }
//        System.out.println("Hexadecimal="+hex);
    }
}
