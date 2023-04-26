// Uttu broke his phone. He can get it repaired by spending X rupees or he can buy a new phone by spending Y rupees. Uttu wants to spend as little money as possible. Find out if it is better to get the phone repaired or to buy a new phone.

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
		    if(x<y){
		        System.out.println("Repair");
		    }
		    else if(y<x){
		        System.out.println("New Phone");
		    }
		    else{
		        System.out.println("Any");
		    }
		}
	}
}
