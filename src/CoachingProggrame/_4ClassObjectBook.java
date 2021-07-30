package CoachingProggrame;

import java.util.Scanner;

class book{
    int book_id;
    float disc,mrp;
    String subject;
    Scanner sc=new Scanner(System.in);
    book(){
        System.out.println("Enter subject");
        subject=sc.nextLine();
        System.out.println("enter mrp:");
        mrp=sc.nextInt();
        System.out.println("Enter book id");
        book_id=sc.nextInt();
        System.out.println("Enter discount");
        disc=sc.nextInt();
    }
    void display(){
        System.out.println("==================================");
        System.out.println("Book id: "+book_id);
        System.out.println("Book name: "+subject);
        System.out.println("MRP: "+mrp);
        System.out.println("Book Discount: "+disc+"%");
    }

}
public class _4ClassObjectBook {
    public static void main(String[] args) {
        book[] b=new book[5];
        for(int i=0;i<5;i++){
            b[i]= new book();
        }
        for(int i=0;i<5;i++){
            int x=b[i].subject.compareTo("math");
            if(x==0)
            b[i].display();
        }

    }
}
