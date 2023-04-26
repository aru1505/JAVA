// Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.For the first style, tiling the floor will cost X1 rupees and painting the walls will cost Y1 rupees.
// For the second style, tiling the floor will cost X2 rupees and painting the walls will cost Y2 rupees.
// Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?

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
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    if((x1+y1)<(x2+y2)){
		        System.out.println(x1+y1);
		    }
		    else{
		        System.out.println(x2+y2);
		    }
		}
	}
}
