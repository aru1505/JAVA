// Chef has opened a new airline. Chef has 10 airplanes where each airplane has a capacity of X passengers.
// On the first day itself, Y people are willing to book a seat in any one of Chef's airplanes.
// Given that Chef charges Z rupees for each ticket, find the maximum amount he can earn on the first day.

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
		    if((x*10)>=y){
		        System.out.println(y*z);
		    }
		    else{
		        System.out.println(x*10*z);
		    }
		}
	}
}
