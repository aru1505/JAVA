// Chef's current rating is X, and he wants to improve it. It is generally recommended that a person with rating X should solve problems whose difficulty lies in the range x and [X,X+200], i.e, problems whose difficulty is at least X and at most X+200.You find out that Chef is currently solving problems with a difficulty of Y.
// Is Chef following the recommended practice or not?

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
		    if((x<=y)&&(y<=(x+200))){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
