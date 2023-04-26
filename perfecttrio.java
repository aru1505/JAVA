// Chef defines a group of three friends as a perfect group if the age of one person is equal to the sum of the age of remaining two people.Given that, the ages of three people in a group are A,B, and moC respectively, find whether the group is perfect.
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
		    int c = sc.nextInt();
		    if(a+b==c||b+c==a||a+c==b){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
