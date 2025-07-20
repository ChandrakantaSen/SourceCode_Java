// find the occurance of the given character.
import java.io.*;
class char2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader string_obj = new BufferedReader(new InputStreamReader(System.in));
		String text;
		char ch;
		int i=0,count=0;
		System.out.print("Enter any Text  ");     	text=string_obj.readLine();
		System.out.print("Enter any Character :"); 	ch=(char)string_obj.read();
		do{
			if(text.charAt(i)==ch) count++;

			i++;
		}while(i<text.length());
		System.out.println("Number of occuration : "+count);
	}

}
