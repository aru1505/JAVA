// In the medieval age, there were 3 kingdoms A,B, and C. The army of these kingdom had NA,NB and NC soldiers respectively.You are given that an army with X soldiers can defeat an army with Y soldiers only if X>Y.
// An army is said to be dominant if it can defeat both the other armies combined. For example, kingdom C's army will be dominant only if NC>NA+NB.
// Determine whether any of the armies is dominant or not.

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
		    int Na = sc.nextInt();
		    int Nb = sc.nextInt();
		    int Nc = sc.nextInt();
		    if (Na+Nb<Nc||Nb+Nc<Na||Na+Nc<Nb)
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
