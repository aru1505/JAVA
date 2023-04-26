// On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.
// Given the number of problems in each of these 3 categories as X,Y, and Z respectively (where all three integers are distinct), find if the user has been most active as a Setter, Tester, or Editorialist.

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if(x>y&&x>z){
		        System.out.println("Setter");
		    }
		    else if(y>z){
		        System.out.println("Tester");
		    }
		    else{
		        System.out.println("Editorialist");
		    }
		}
	}
}
