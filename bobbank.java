// Bob has an account in the Bobby Bank. His current account balance is W rupees.Each month, the office in which Bob works deposits a fixed amount of X rupees to his account.Y rupees is deducted from Bob's account each month as bank charges.Find his final account balance after Z months. Note that the account balance can be negative as well.

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
		    int w = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    System.out.println(w+(x-y)*z);
		}
	}
}
