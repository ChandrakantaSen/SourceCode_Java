package mypackage2;

import pack.pack2.*;
import pack.*;
import java.util.*;

class prog7
{
		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int c,d;
			System.out.println("enter numbers: ");
			c=sc.nextInt();
			d=sc.nextInt();
			
			prog6 ob = new prog6(c,d);
			ob.sum();
		//	ob.sum();
			 
		}
}
