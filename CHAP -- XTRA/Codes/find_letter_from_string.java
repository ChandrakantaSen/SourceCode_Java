import java.io.*;
class find_letter_from_string
{
	public static void main(String args[]) throws IOException
	{
		String s;
		char ch;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Any string    : ");  s=obj.readLine();
		System.out.print("Enter Any Character : ");  ch=(char)obj.read();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println("The Given Character Found at Location "+i);
			}
		}

		System.out.println(" End of Program");
	}
}
