/**
 * @(#)check.java
 *
 *
 * @author 
 * @version 1.00 2014/8/16
 */

import java.util.*;

public class check
 {
	public static void main (String[] args)
	{
		
		int a,b;
		Scanner obj = new Scanner(System.in);
		
		a=obj.nextInt();
		b=obj.nextInt();
		
		if(a>b)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");	
	}    
    
}