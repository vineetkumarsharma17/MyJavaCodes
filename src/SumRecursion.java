class recur{
    int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);


    }
}
public class SumRecursion {
    public static void main(String[] args) {
        recur r=new recur();
        System.out.println(r.sum(10));
    }
}
