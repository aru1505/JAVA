// To find the roots of Quadratic Equation.
import java.util.Scanner;

public class rootsofquad
{
    public static void main(String[] args)
    {
        int a,b,c;
        double x,y;
        System.out.println("Enter a,b,c");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        x=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        y=(-b-Math.sqrt(b*b-4*a*c))/2*a;

        System.out.println("The roots are"+x+""+y);

    }
}
