// Chef has a bucket having a capacity of K liters. It is already filled with X liters of water.
// Find the maximum amount of extra water in liters that Chef can fill in the bucket without overflowing.

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
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    System.out.println(k-x);
		}
	}
}
