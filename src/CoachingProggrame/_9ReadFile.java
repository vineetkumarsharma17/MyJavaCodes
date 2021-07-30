package CoachingProggrame;
import java.io.File;
import java.io.FileInputStream;

public class _9ReadFile {
    public static void main(String[] args) {
        try{
            File file=new File("C:/Users/vkwilson/IdeaProjects/vkwilson/src/hello.txt");
            FileInputStream fio=new FileInputStream(file);
            int count=0;
            while (fio.available()>0){
                System.out.print((char)fio.read());
                count++;
            }
            System.out.println();
            System.out.println("No of char:"+count);

        }catch (Exception e){

        }
    }
}