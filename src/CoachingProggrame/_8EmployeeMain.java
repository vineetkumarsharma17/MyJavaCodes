package CoachingProggrame;

import java.util.Scanner;

class employee{
    int id;
    String name,email;
    Scanner sc=new Scanner(System.in);
    employee(){
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter id");
        id=sc.nextInt();
        System.out.println("Enter email:");
        email=sc.next();
    }
    void display(){
        System.out.println("===========================================");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Email:"+email);
    }
}
class DailyBasis extends employee{
    int workinghour,perhour;
    Scanner sc=new Scanner(System.in);
    DailyBasis(){
        super();
        System.out.println("Enter working hour of "+name);
        workinghour=sc.nextInt();
        System.out.println("Enter amount per hour:");
        perhour=sc.nextInt();
    }
    void payment(){
        float p=workinghour*perhour;
        System.out.println("Payable amount of "+name +" is "+p);
    }
}
class RegularBasis extends employee{
    float sal;
    int leave;            //  cut Rs 50/- per leave
    Scanner sc=new Scanner(System.in);
    RegularBasis(){
        super();
        System.out.println("Enter salary of employee:");
        sal=sc.nextFloat();
        System.out.println("Enter number of leave:");
        leave=sc.nextInt();
    }
    void salarySlip(){
        float hra=(float)sal*10/100f;
        float ta=(float)sal*12/100f;
        float da=(float)sal*18/100f;
        float pf= (float) ((float)sal*25.0/100f);
        float gs=sal+hra+ta+da;
        float ns=gs-pf-(leave*50);
        System.out.println("Gross Salary:"+gs);
        System.out.println("Net Salary:"+ns);
    }
}
public class _8EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Daily Basis employee:");
        DailyBasis d=new DailyBasis();
        System.out.println("Regular Basis employee:");
        RegularBasis r=new RegularBasis();
        d.display();
        d.payment();
        System.out.println("Daily Basis employee:");
        System.out.println("Regular Basis employee:");
        r.display();
        r.salarySlip();
    }
}
