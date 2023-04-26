// Chef has to travel to another place. For this, he can avail any one of two cab services.
// The first cab service charges X rupees.
// The second cab service charges Y rupees.
// Chef wants to spend the minimum amount of money. Which cab service should Chef take?

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
	        if(x<y){
	            System.out.println("First");
	        }
	        else if(x==y){
	            System.out.println("Any");
	        }
	        else{
	            System.out.println("Second");
	        }
	    }
	}
}
