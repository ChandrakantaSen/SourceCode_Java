import java.util.*;
import  java.io.*;
class tokenprog
{
	static InputStreamReader input = new InputStreamReader(System.in);
	static BufferedReader keybip = new BufferedReader(input);
	public static void main (String[] args)throws IOException
		 {
		 	System.out.print("enter a string: ");
		 	StringTokenizer data = new StringTokenizer(keybip.readLine());
		 	int no_of_token;
		 	
		 	no_of_token = data.countTokens();
		 	System.out.println("no of tokens: "+no_of_token);
		 	for(int i=0;i<no_of_token;i++)
		 	{
		 		System.out.println(data.nextToken());
		 	}
}
}