import java.util.Random;
import java.util.Scanner;

class Game{
    int nog;
    int n,Number;
    Game()
    {
        Random rand=new Random();
        this.n=rand.nextInt(100);

    }
    void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        this.Number=sc.nextInt();


    }
    int getNOG(){
return nog;
    }
    void setNOG(int n){
    this.nog=n;
    }
    boolean isCorrect() {
        nog++;
        if (Number == n)
        {
            System.out.print("Congratulations you guise the right number");
            System.out.println("in "+nog +" steps.");
            return true;
        }
        else if (Number < n)
                System.out.println("Too less number");
            else if (Number > n)
            System.out.println("Too high number");
                return false;
    }
}

public class GuissTheNumber {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b=false;
       while (!b){
           g.userInput();
           b= g.isCorrect();
       }


    }
}

