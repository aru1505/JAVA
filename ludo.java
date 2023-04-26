// Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when he rolls a 66 on the die.In the current turn, Chef rolled the number X on the die. Determine if Chef can enter a new token into the play in the current turn or not.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		   int x=sc.nextInt();
		   if(x==6)
		   {
		       System.out.println("YES");
		   }
		   else 
		   {
		       System.out.println("NO");
		   }
		}
	}
}