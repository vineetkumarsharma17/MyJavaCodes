import java.util.*;
import java.io.IOException;
public class ArrayProject {
    int [] arr=new int[20];
    Scanner sc=new Scanner(System.in);
    int n;
   void insert(){
       System.out.println("Enter the numbr of value:");
       n=sc.nextInt();
       for (int i=0;i<n;i++)
       {
           System.out.print("Enter value "+(i+1)+" :");
           arr[i]=sc.nextInt();
       }

    }
    void display(){
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayProject a=new ArrayProject();
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1.Insert value in array.");
            System.out.println("2.Display.");
            System.out.println("3.Sort in Deassending.");
            System.out.println("4.Searching.");
            System.out.println("5.Replace value");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch (ch){
                case 1-> a.insert();
                case 2->a.display();
               // default -> System.exit();
            }
        }
    }
}
