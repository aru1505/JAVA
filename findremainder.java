// Write a program to find the remainder when an integer A is divided by an integer B.

import java.util.*;
class Remainder
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a%b);
        }
    }
}