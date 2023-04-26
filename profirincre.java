// Chef recently started selling a special fruit.He has been selling the fruit forX rupees (X is a multiple of 100 100). He earns a profit of Y rupees on selling the fruit currently.Chef decided to increase the selling price by 10%. Please help him calculate his new profit after the increase in selling price.Note that only the selling price has been increased and the buying price is same.

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
		    int buy = x-y;
		    int per = x/10;
		    per = per + x;
		    System.out.println(per-buy);

		}
	}
}
