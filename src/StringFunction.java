import java.util.Scanner;
public class StringFunction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st;
        System.out.print("Enter a string:");
        st=s.nextLine();
        System.out.println("You Entered:"+st);
        //string function
        int len=st.length();        //return length of the string
        System.out.println("Length="+len);
        String lw=st.toLowerCase(); //return lower case of string
        String up=st.toUpperCase(); //return upper case of string
        String trm=st.trim();       //remove the blank space at starting and end
        String sub=st.substring(5); //return string begain with given index number
        String sub2=st.substring(2,10); //return string begain(2) and end(10) with given index number
        String replaced=st.replace('a','A');    //replace the specified character with new character
        System.out.println("Lower case:"+lw);
        System.out.println("UPPER CASE:"+up);
        System.out.println("trimmed string:"+trm);
        System.out.println("Substring begain with index 5 :"+sub);
        System.out.println("Substring begain with 2 and end with 10 index:"+sub2);
        System.out.println("Replaced 'a' with 'A':"+replaced);
        boolean a=st.startsWith("This");    //check string is begain with given argument or not
        System.out.println("Start with 'This' or Not:"+a);
       a=st.endsWith("wilson");//check string is end with given argument or not
        System.out.println("End with 'wilson' or Not:"+a);

    }
}
