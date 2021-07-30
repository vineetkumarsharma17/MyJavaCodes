import java.util.Scanner;
 class io{
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[20],arr2=new int[20];
    int n;
   void  putarr() {
       System.out.print("Enter the numnber of element:");
       n = sc.nextInt();
       for (int i = 0; i < n; i++) {
           System.out.print("Enter element " + (i + 1)+" :");
           arr[i] = sc.nextInt();
       }
       copy(1);
   }
      void  getarr(){
            for (int i=0;i<n;i++)
                System.out.print(" "+arr[i]);
          System.out.println();

       }
       void copy(int x){
       if(x==1){
           for(int i=0;i<n;i++)
               arr2[i]=arr[i];
       }
       else
       {
           for(int i=0;i<n;i++)
               arr[i]=arr2[i];
           System.out.print("Reset done.");getarr();
       }

       }
}
class sorting extends io{
     void bubblesort()
     {int i,j,temp;
         for(i=0;i<n;i++)
             for(j=0;j<(n-i-1);j++)
                 if(arr[j]>arr[j+1]){
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
         System.out.print("Sorting done!");
                 getarr();
     }
     void linearsort(){
         int i,j,temp,key=0;
         for(i=0;i<n-1;i++) {
             key=i;
             for (j = i+1; j < n; j++)
                 if (arr[key] > arr[j])
                     key=j;
         temp = arr[i];
         arr[i] = arr[key];
         arr[key] = temp;
         }
         System.out.print("Sorting done!");getarr();
     }
 }

public class AlgorithmSortingSearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // io a=new io();
        sorting s =new sorting();
        while(true) {
            System.out.println("1.Input array");
            System.out.println("2.Display array");
            System.out.println("3.Sorting");
            System.out.println("0.for exit");
            System.out.print("Enter choice:");
            int ch=sc.nextInt();
            if(ch==0)
                break;
            else
                switch (ch){
                case 1-> s.putarr();
                case 2->s.getarr();
                case 3-> {
                    System.out.println("1.Bubble sort");
                    System.out.println("2.Lenear Sort");
                    System.out.println("0.Reset array");
                    System.out.print("Enter choice:");
                    int a = sc.nextInt();
                    switch (a){
                        case 1->s.bubblesort();
                        case 2->s.linearsort();
                        case 0->s.copy(2);
                        default -> System.out.println("Wrong choice.");
                    }
                }
                    default -> System.out.println("Wrong choice.");
                }
        }
    }
}
