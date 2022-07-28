import java.util.Scanner; 
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
public class Validation { public static void main(String[] args)
{

            String[] s= {"prasi@gmail.com","peter@gmail.com","navin@gmail.com","pravin@yahoo.com","cringe@yaahoo.com","harish@yahoo.com","priya123@gmail.com","priya..sweety@yahoo.com"};            //String getting from the user

            System.out.println("Enter your mail Id");
            Scanner sc=new Scanner(System.in);
            String h=sc.next();
            boolean c =false;

            for(int i=0;i<s.length;i++) {
                if(h.equalsIgnoreCase(s[i])){

                     c=true;
                }


            }

            if(c==false) {
                System.out.println(h+"  Email ID is not present in Employee ID");
            }
            else {
                System.out.println(h+"  Email ID is present in Employee ID");
            }

} }