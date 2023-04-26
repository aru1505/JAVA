// In a recent breakthrough in mathematics, the proof utilized a concept called Height.Consider a fraction b. Its Height is defined as the maximum of its numerator and denominator. So, for example, the Height of 3 would be 9 19, and the Height of would be 27.Given a and b, find the Height of b a.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = Math.max(a,b);
		System.out.println(c);
	}
}
