import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter 9 values :");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        System.out.println("VAlues of arrays is :");
        for (int[] x : arr) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println("");
        }
    }
}
