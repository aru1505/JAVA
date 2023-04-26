//Chef is looking to buy a TV and has shortlisted two models. The first one costs A rupees, while the second one costs B rupees.Since there is a huge sale coming up on Chefzon, Chef can get a flat discount of C rupees on the first TV, and a flat discount of D rupees on the second one.
// Help Chef determine which of the two TVs would be cheaper to buy during the sale. 

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
		    int d = sc.nextInt();
		    if((a-c)<(b-d)){
		        System.out.println("First");
		    }
		    else if((a-c)>(b-d)){
		        System.out.println("Second");
		    }
		    else{
		        System.out.println("Any");
		    }
		}
	}
}
