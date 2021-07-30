package CoachingProggrame;

//wap to chek the dir and files of given dir
import java.io.File;

public class _10CheckDirectoryAndFile {
    public static void main(String[] args) {
        try{
            File file=new File("C:\\Users\\vkwilson\\IdeaProjects\\vkwilson\\src\\Temp");
            String k[]=file.list();
            for (String n:k)
            {
                File f=new File("C:\\Users\\vkwilson\\IdeaProjects\\vkwilson\\src\\Temp\\"+n);
                if(f.isDirectory())
                    System.out.println(n+" is directory");
                else
                    System.out.println(n+" is file");
            }

        }catch (Exception e){

        }
    }
}
