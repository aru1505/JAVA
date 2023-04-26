// Chef appeared for an exam consisting of 3 sections. Each section is worth 100 marks.Chef scored A marks in Section 1,B marks in section 2, and C marks in section 3.Chef passes the exam if both of the following conditions satisfy:
// Total score of Chef is ≥100;Score of each section ≥10.
// Determine whether Chef passes the exam or not.

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = a+b+c;
		    if((d>=100)&&(a>=10)&&(b>=10)&&(c>=10)){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    }
		}
	}
}
