
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File file=new File("C:/Users/vkwilson/IdeaProjects/vkwilson/src/hello.txt");
            FileInputStream fin=new FileInputStream(file);
            int count=0;
            while(fin.available()>0)
            {count++;
                System.out.print((char)fin.read());

            }
            System.out.println();
            System.out.println("no of char is:"+count);

        }catch(Exception e){}



    }
}
