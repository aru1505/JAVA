// Chef appeared for a placement test.There is a problem worth X points. Chef finds out that the problem has exactly 1010 test cases. It is known that each test case is worth the same number of points.Chef passes N test cases among them. Determine the score Chef will get.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    int p=x/10;
		    System.out.println(p*n);
		    
		}
	}
}
