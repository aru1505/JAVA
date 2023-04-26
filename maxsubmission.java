// A participant can make 1 submission every 30 seconds. If a contest lasts for X minutes, what is the maximum number of submissions that the participant can make during it?
// It is also given that the participant cannot make any submission in the last 5 seconds of the contest.

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
		    System.out.println((60*x)/30);
		}
	}
}
