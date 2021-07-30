import java.util.*;
public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr;
        arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter value"+i+1+":");
            arr[i]=sc.nextInt();
        }
        for(int x: arr)
            System.out.println(x);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}
