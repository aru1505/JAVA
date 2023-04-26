// Chef has started working at the candy store. The store has 100 chocolates in total.Chef’s daily goal is to sell X chocolates. For each chocolate sold, he will get 1 rupee. However, if Chef exceeds his daily goal, he gets 2 rupees per chocolate for each extra chocolate.
// If Chef sells Y chocolates in a day, find the total amount he made.

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
		    if(x>=y){
		        System.out.println(y);
		    }
		    else{
		        System.out.println(x+(y-x)*2);
		    }
		}
	}
}
