// For the upcoming semester, the admins of your university decided to keep a total of X seats for the MATH-1 course. A student interest survey was conducted by the admins and it was found that Y students were interested in taking up the MATH-1 course.
// Find the minimum number of extra seats that the admins need to add into the MATH-1 course to make sure that every student who is interested in taking the course would be able to do so.

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
		    if(y>x){
		        System.out.println(y-x);
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}