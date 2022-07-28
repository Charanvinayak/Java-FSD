
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    int a,b,c,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the fist number");
    a=sc.nextInt();
    System.out.println("enter the second number");
    b=sc.nextInt();
    System.out.println("1.addition \n 2.subtraction\n3.multiplication\n4.division\n5.exit");    
    
    c=sc.nextInt();
    switch(c)
    {
    case 1:

        d=a+b;
        System.out.println("addition of two numbers is"+d);
        break;
        case 2:

            d=a-b;
            System.out.println("subtraction of two numbers is"+d);
            break;
            case 3:

                d=a*b;
                System.out.println("multiplication of two numbers is"+d);
                break;
                case 4:

                    d=a/b;
                    System.out.println("quotient of two numbers is"+d);
                    break;

    }


}

}