// This semester, Chef took X courses. Each course has Y units and each unit has Z chapters in it.
// Find the total number of chapters Chef has to study this semester.

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
		    System.out.println(x*y*z);
		}
	}
}
