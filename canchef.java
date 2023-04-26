// Chef owns a car that can run 15 kilometers using 1 liter of petrol.He wants to attend a programming camp at DAIICT.X liters of petrol is present in Chef's car. The distance between his house and DAIICT is Y kilometers.
// Determine whether Chef can attend the event and return to his home with the given amount of petrol.
// Note: Chef has to return back to home, so the total distance to be covered would be 2⋅Y.

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
		    x = 15*x;
		    if(x>=2*y){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
