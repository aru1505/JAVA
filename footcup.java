// It is the final day of La Liga. Chef has a certain criteria for assessing football matches.
// In particular, he only likes a match if:
// The match ends in a draw, and,
// At least one goal has been scored by either team.
// Given the goals scored by both the teams as X and 
// Y respectively, determine whether Chef will like the match or not.

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
		    if((x==y)&&((x>=1)||(y>=1))){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
