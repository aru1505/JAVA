// Chef is the financial incharge of Chefland and one of his duties is identifying if any company has gained a monopolistic advantage in the market.There are exactly 3 companies in the market each of whose revenues are denoted by R1,R2 and R3 respectively. A company is said to have a monopolistic advantage if its revenue is strictly greater than the sum of the revenues of its competitors.
// Given the revenue of the 3 companies, help Chef determine if any of them has a monopolistic advantage.

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
		    int r1 = sc.nextInt();
		    int r2 = sc.nextInt();
		    int r3 = sc.nextInt();
		    if(r1+r2<r3||r2+r3<r1||r1+r3<r2){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}