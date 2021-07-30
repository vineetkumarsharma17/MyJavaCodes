import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] m1,m2,m3;
        m1=new int [3][3];
        m2=new int [3][3];
        System.out.println("Enter the value of first matrix:");
        for(int i=0;i< m1.length;i++)
            for (int j=0;j<m1[i].length;j++)
                m1[i][j]=sc.nextInt();
        System.out.println("Enter the value of second matrix:");
        for(int i=0;i< m2.length;i++)
            for (int j=0;j<m2[i].length;j++)
                m2[i][j]=sc.nextInt();
        m3=new int [3][3];
        int sum=0,i,j;
        for( i=0;i< 3;i++) {
            for ( j = 0; j < 3; j++)
            {
                for(int k=0;k<3;k++)
                    sum+=m1[i][k]*m2[k][j];
                m3[i][j]=sum;
                sum=0;
        }}
        System.out.println("Multiplication of both matrix:");
        for(i=0;i< m3.length;i++) {
            for (j = 0; j < m3[i].length; j++)
                System.out.print(m3[i][j]+" ");
            System.out.println();
        }

    }
}
