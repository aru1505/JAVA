// Chef wants to appear in a competitive exam. To take the exam, there are following requirements:Minimum age limit is X (i.e. Age should be greater than or equal toX).Age should be strictly less than Y.Chef's current Age is A. Find whether he is currently eligible to take the exam or not.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=1;i<=t;i++)
	{
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		
		if((a>=x) && (a<y))
		{
		    System.out.println("YES");    
		}
		else
		{
		    System.out.println("NO"); 
		}
	}
	}
}
