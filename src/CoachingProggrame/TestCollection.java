package CoachingProggrame;
import java.util.*;
public class TestCollection
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> k=new HashMap<Integer,String>();
        k.put(786,"Rizwan");
        k.put(543,"Mohan");
        k.put(345,"Pawan");
        k.put(234,"Nandan");
        k.put(432,"Briz");
        k.put(543,"Kamal");

        Set s=k.entrySet();
        Iterator i=s.iterator();

        while (i.hasNext())
        {
            Map.Entry obj=(Map.Entry)i.next();
            System.out.println(obj.getKey()+"  "+obj.getValue());
        }



    }
}
