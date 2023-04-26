// Chef wants to give a burger party to all his N friends i.e. he wants to buy one burger for each of his friends.The cost of each burger is X rupees while Chef has a total of K rupees.
// Determine whether he has enough money to buy a burger for each of his friends or not.

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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    if(n*x<=k){
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
