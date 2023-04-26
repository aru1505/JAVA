//Swapping of two numbers.
import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two numbers to be swapped");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+ " "+b);
    }
}
