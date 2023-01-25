import java.util.Scanner;

public class main {
        public static void main(String[] args)
        {
            int a,b;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the Value of a : ");
            a=scan.nextInt();
            System.out.print("Enter the Value of b : ");
            b=scan.nextInt();
            System.out.println("Add is : " +(a+b));
            System.out.println("Sub is : "+( a-b));
            System.out.println("Mul is : "+( a*b));
            System.out.println("Div is : "+( a/b));

        }
    }