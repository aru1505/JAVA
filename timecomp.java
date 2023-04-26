// A sorting algorithm A is said to have more time complexity than a sorting algorithm B if it uses more number of comparisons for sorting the same array than algorithm B.Given that algorithm A uses X comparisons to sort an array and algorithm B uses Y comparisons to sort the same array, find whether algorithm A has more time complexity.

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
		    if(a>b){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
