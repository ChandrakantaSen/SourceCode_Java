/*
 * WAP to accept a string and delete the vowels from it and prints the new string
 */
 
import java.util.Scanner;
 
public class Code29
{ 
    public static void main(String[] args) 
    {
    	String str,str1="";
    	int i,length;
        char ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        str = sc.nextLine();
        length= str.length();
        
        for(i=0;i<length;i++)
        {
        	ch = str.charAt(i);
        	
        	if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
        	{
        		System.out.print(ch);
        	}
        }  
    }
}