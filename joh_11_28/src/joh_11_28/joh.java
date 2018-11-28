package joh_11_28;
import java.util.Scanner;

public class joh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long res = 0;

		for(int x =1; x < n/2  ;x++)   // x (1~ n/2)
		{
			 for(int y= n ; x < y ; y--) //y (n~ x)
			 {
					 if( n+1 >(x+y))
						 res++;
			 }
		}
		System.out.println(res);
			
		
	
	}

}
