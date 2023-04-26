// To find the TotalArea and volume of a Cuboid.
import java.util.Scanner;

public class cuboid
{
    public static void main(String[] args)
    {
        int l,b,h;
        int TA, Vol;
        System.out.println("Enter the length, breadth and height of the cuboid");
        Scanner sc=new Scanner(System.in);
        l= sc.nextInt();
        b= sc.nextInt();
        h= sc.nextInt();

        TA= 2*(l*b+b*h+l*h);
        Vol= l*b*h;
        System.out.println("The Total area of cuboid is= "+TA);
        System.out.println("The Volume of cuboid is= "+Vol);
    }
}
