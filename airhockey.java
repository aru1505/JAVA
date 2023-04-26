// Alice is playing Air Hockey with Bob. The first person to earn seven points wins the match. Currently, Alice's score is A and Bob's score is B.
// Charlie is eagerly waiting for his turn. Help Charlie by calculating the minimum number of points that will be further scored in the match before it ends.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b){
		    System.out.println(7-a);
		}
		else{
		    System.out.println(7-b);
		}
		}
	}
}
