// CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:Recent Contest Problems - contains only problems from the last 2 contestsSeparate Un-Attempted, Attempted, and All tabs Problem Difficulty Rating - the Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experiencePopular Topics and Tags Our Chef is currently practicing on CodeChef and is a beginner. The count of ‘All Problems’ in the Beginner section is X. Our Chef has already ‘Attempted’Y problems among them. How many problems are yet ‘Un-attempted’?

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x-y);
	}
}
