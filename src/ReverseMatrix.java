import java.util.Scanner;

public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] m1={{1,2,3},{4,5,6},{7,8,9}};
        int [][] m2=new int[3][3];
        for (int i=0;i<m1.length;i++)
            for (int j=0;j<m1[i].length;j++)
                m2[i][j]=m1[j][i];
        System.out.println("Matrix 1");
        for (int i=0;i<m1.length;i++)
        {for (int j=0;j<m1[i].length;j++)
                System.out.print(m1[i][j]+" ");
        System.out.println();
        }
        System.out.println("Transpose of matrix:");
        for (int i=0;i<m1.length;i++)
        {for (int j=0;j<m1[i].length;j++)
            System.out.print(m2[i][j]+" ");
            System.out.println();
        }

    }
}
