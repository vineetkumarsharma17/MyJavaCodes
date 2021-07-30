import java.util.Scanner;
public class SearchhingInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter value"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to search:");
        int se=sc.nextInt();
        boolean flag=false;
        int i;
        for(i=0;i<arr.length;i++)
            if(arr[i]==se)
            {
                flag=true;
                break;
            }
        if(flag==true)
            System.out.println(se+" found at index "+i);
        else
            System.out.println("value not found");
    }
}
