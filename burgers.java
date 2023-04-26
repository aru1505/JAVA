// Chef is fond of burgers and decided to make as many burgers as possible.Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.Find the maximum number of burgers that Chef can make.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int patty=sc.nextInt();
		    int bun=sc.nextInt();
		    if(patty<bun){
		        System.out.println(patty);
		    }
		    else
		    {
		        System.out.println(bun);
		    }
		}
	}
}
