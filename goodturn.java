//Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.They consider a turn to be good if the sum of the numbers on their dice is greater than 66.Given that in a particular turn Chef and Chefina got X and Y on their respective dice, find whether the turn was good. 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int T;
	    int X,Y;
	    Scanner sc=new Scanner(System.in);
	    T=sc.nextInt();
	    for(int i=0;i<T;i++){
	    X=sc.nextInt();
	    Y=sc.nextInt();
	    if((X+Y)>6)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	        System.out.println("NO");
	    }
	  }
	}
}
