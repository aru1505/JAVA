// Chef wants to gift C chocolates to Botswal on his birthday. However, he has only X chocolates with him.The cost of 1 chocolate is Y rupees.
// Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal./

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
		    int z = sc.nextInt();
		    System.out.println((x-y)*z);
		}
	}
}