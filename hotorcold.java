// Chef considers the climate HOT if the temperature is above 20, otherwise he considers it COLD. You are given the temperature C, find whether the climate is HOT or COLD.

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
		    int c = sc.nextInt();
		    if(c>20){
		        System.out.println("HOT");
		    }
		    else 
		    {
		        System.out.println("COLD");
		    }
		}
	}
}
