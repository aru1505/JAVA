// Chef is not feeling well today. He measured his body temperature using a thermometer and it came out to be X °F.A person is said to have fever if his body temperature is strictly greater than 98 °F.Determine if Chef has fever or not.

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
		    if(x>98){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    }
	}
}
