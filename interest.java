// Chef has invested his money at an interest rate of X percent per annum while the current inflation rate is Y percent per annum.An investment is called good if and only if the interest rate of the investment is at least twice of the inflation rate.Determine whether the investment made by Chef is good or not.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>=2*y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
