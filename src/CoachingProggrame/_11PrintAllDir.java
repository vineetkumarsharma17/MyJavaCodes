package CoachingProggrame;
import java.io.File;
//wap to print all dir and sub dirr and  files of given dir
public class _11PrintAllDir {
    public static void main(String[] args) {
        String path="C:\\Users\\vkwilson\\IdeaProjects\\vkwilson\\src\\Temp";
        dir(path);
    }
    static void dir(String path){
        File file=new File(path);
        String[] s=file.list();
        for (String k:s){
            File f=new File(path+"\\"+k);
            if(f.isFile())
                System.out.println(k);
            else
            if(f.isDirectory()) {
                System.out.println("==========================");
                System.out.println(k);
                dir(path + "\\" + k);
            }

        }

    }
}
