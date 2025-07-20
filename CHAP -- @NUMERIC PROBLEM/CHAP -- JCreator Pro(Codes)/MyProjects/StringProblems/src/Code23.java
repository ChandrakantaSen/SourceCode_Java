/*
 * String Pattern - VII
 *	HELLO
 *	HELL
 *	HEL
 *	HE
 *	H
 */

import java.util.Scanner;
 
public class Code23
{ 
    public static void main(String[] args) 
    {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int length= s.length();
        
        char [] a=s.toCharArray();
        
        System.out.println("\nPrinting the pattern: ");
        
        for (int i = length-1; i >= 0; i--) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
}