package CoachingProggrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Bank{
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> ac=new ArrayList<Integer>();
    ArrayList<Float> bal=new ArrayList<>();
    ArrayList<String> name=new ArrayList<String>();
    void BankAdd(){
        System.out.println("Enter account number");
        int a;
        a=sc.nextInt();
        if(ac.indexOf(a)!=-1)
        {

            System.out.println("Detail already available! Try again");
            return;
        }
        ac.add(a);
        System.out.println("Enter Balance:");
        bal.add(sc.nextFloat());
        System.out.println("Enter name:");
        sc.nextLine();
        name.add(sc.nextLine());
    }
    void display(){
        //Iterator i=ac.iterator();
        int x=ac.size();
        System.out.println("Size=="+x);
        for (int a=0;a<x;a++){
            System.out.println("=================Record No " +(a+1)+" =====================");
            System.out.println("Name:"+name.get(a));
            System.out.println("Account Number:"+ac.get(a));
            System.out.println("Balance:"+bal.get(a));

        }

    }
    void searchAc(){
        System.out.println("Enter account no for search:");
        int a=sc.nextInt();
        if(ac.indexOf(a)!=-1){
            int index=ac.indexOf(a);
            System.out.println("=================Record Found!=====================");
            System.out.println("Name:"+name.get(index));
            System.out.println("Account Number:"+ac.get(index));
            System.out.println("Balance:"+bal.get(index));
        }
        else
            System.out.println("Record Not found.");
    }
    void deposit(){
        System.out.println("Enter account no for deposite:");
        int a=sc.nextInt();
        int ind=ac.indexOf(a);
        if(ind==-1){
            System.out.println("Account not found!");
        }
        else{
            System.out.println("Enter amount:");
            float amount=sc.nextFloat();
            amount=amount+bal.get(ind);
            bal.add(ind,amount);
            System.out.println("Successs!");
        }
    }
    void withdraw(){
        System.out.println("Enter account no for withdraw:");
        int a=sc.nextInt();
        int ind=ac.indexOf(a);
        if(ind==-1){
            System.out.println("Account not found!");
        }
        else {
            System.out.println("Enter amount:");
            float amount = sc.nextFloat();
            if (bal.get(ind) - amount < 1000)
                System.out.println("Can't Withdraw due to minimum amount is less than 1000");
            else {
                amount=bal.get(ind)-amount;
                bal.add(ind, amount);
                System.out.println("Successs!");
            }
        }

    }

}

public class _12BankSystemUsingFramework {
    public static void main(String[] args) {
        Bank b=new Bank();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Open Account");
            System.out.println("2.Display All");
            System.out.println("3.Search Account");
            System.out.println("4.Depposite");
            System.out.println("5.Withdraw");
            System.out.println("Enter choice:");

            int ch=sc.nextInt();
            switch (ch){
                case 1:b.BankAdd();break;
                case 2:b.display();break;
                case 3:b.searchAc();break;
                case 4:b.deposit();break;
                case 5:b.withdraw();break;
                default:
                    System.out.println("Wrong choice!");
            }
            System.out.println("Do you want continue(y/n)");
            char c=sc.next().charAt(0);
            if(c=='n')
                break;
        }

    }
}
