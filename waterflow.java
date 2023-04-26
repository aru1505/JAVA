// Alice has a bucket of water initially having W litres of water in it. The maximum capacity of the bucket is X liters.Alice turned on the tap and the water starts flowing into the bucket at a rate of Y litres/hour. She left the tap running for exactly Z hours. Determine whether the bucket has been overflown, filled exactly, or is still left unfilled.

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
		    int a = w+(y*z);
		    if(a>x){
		        System.out.println("Overflow");
		    }
		    else if(a==x){
		        System.out.println("Filled");
		    }
		    else{
		        System.out.println("Unfilled");
		    }
		}
	}
}
