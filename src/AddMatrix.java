import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)   ;
        int [][] m1,m2,m3;
        m1=new int [3][3];
        m2=new int [3][3];
        System.out.println("Enter the value of first matrix:");
        for(int i=0;i< m1.length;i++)
            for (int j=0;j<m1[i].length;j++)
                m1[i][j]=sc.nextInt();
        System.out.println("Enter the value of second matrix:");
        for(int i=0;i< m1.length;i++)
            for (int j=0;j<m1[i].length;j++)
                m2[i][j]=sc.nextInt();
            //adding both matrics
        m3=new int [3][3];
        for(int i=0;i< m1.length;i++)
            for (int j=0;j<m1[i].length;j++)
                m3[i][j]=m1[i][j]+m2[i][j];
        System.out.println("Value of First matrix:");
        for(int i=0;i< m1.length;i++) {
            for (int j = 0; j < m1[i].length; j++)
                System.out.print(m1[i][j]+" ");
            System.out.println();
        }
        System.out.println("Value of Second matrix:");
        for(int i=0;i< m1.length;i++) {
            for (int j = 0; j < m1[i].length; j++)
                System.out.print(m2[i][j]+" ");
            System.out.println();
        }
        System.out.println("Sum of both matrix:");
        for(int i=0;i< m1.length;i++) {
            for (int j = 0; j < m1[i].length; j++)
                System.out.print(m3[i][j]+" ");
            System.out.println();
        }

    }
}
