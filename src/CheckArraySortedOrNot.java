import java.util.Scanner;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)  ;
        int [] arr=new int[20];
        int n;
        System.out.println("Enter the number of element:");
        n=sc.nextInt();
        System.out.println("Enter the value of array:");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("press 1 to check assending order");
        System.out.println("press 2 to check deassending order");
        boolean f1=false,f2=false;
        int ch=sc.nextInt();
        switch (ch){
            case 1->
                    {
                        for(int i=0;i<n-1;i++)
                        if(arr[i]>arr[i+1])
                            f1=true;
                        if (f1==false)
                            System.out.println("Array is sorted in assending order.");
                        else
                            System.out.println("Array is not sorted in assending order.");
                    }
            case 2->{
            for(int i=0;i<n;i++)
                if(arr[i]<arr[i+1])
                    f1=true;
            if (f1==false)
                System.out.println("Array is sorted in deassending order.");
            else
                System.out.println("Array is not sorted in deassending order.");}

        }

    }
}
