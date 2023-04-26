// Akshat has X rupees to spend in the current month. His daily expenditure is Y rupees, i.e., he spends Y rupees each day.Given that the current month has 30 days, find out if Akshat has enough money to meet his daily expenditures for this month.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x>=(30*y)){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
