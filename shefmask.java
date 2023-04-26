// Chef is shopping for masks. In the shop, he encounters 2 types of masks:
// Disposable Masks — cost X but last only 1 day.
// Cloth Masks — cost Y but last 10 days.
// Chef wants to buy masks to last him 100 days. He will buy the masks which cost him the least. In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. Which type of mask will Chef choose?
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
		    int z = 100*x;
		    int w = 10*y;
		    if(z==w){
		        System.out.println("CLOTH");
		    }
		    else if(z>w){
		        System.out.println("CLOTH");
		    }
		    else{
		        System.out.println("DISPOSABLE");
		    }
		}
	}
}
