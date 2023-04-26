// Alice, Bob and Charlie are bidding for an artifact at an auction.Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A,B, and C are distinct).According to the rules of the auction, the person who bids the highest amount will win the auction.Determine who will win the auction.

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    if(a>b&&a>c){
		        System.out.println("Alice");
		    }
		    else if(b>c){
		        System.out.println("Bob");
		    }
		    else{
		        System.out.println("Charlie");
		    }
		    
		}
	}
}
