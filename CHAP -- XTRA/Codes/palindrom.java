import java.io.*;
class palindrom
{
	public static void main(String args[]) throws IOException
	{
		String s;	
		int found=1;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Any string    : ");  s=obj.readLine();
		int l=s.length();
		for(int i=0;i<l/2;i++)
		{
		  	if(s.charAt(i)!=s.charAt(l-i-1))
		  	{
		  		found=0;break;
		  	}
			
		}
		if(found==0)
		 System.out.println("The string is not Palindrom");
		else
		 System.out.println("The Number is Palindrom");		
	}
}