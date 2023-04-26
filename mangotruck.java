// You are given that a mango weighs X kilograms and a truck weighs Y kilograms. You want to cross a bridge that can withstand a weight of Z kilograms.
// Find the maximum number of mangoes you can load in the truck so that you can cross the bridge safely.

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
		    System.out.println((z-y)/x);
		}
	}
}
