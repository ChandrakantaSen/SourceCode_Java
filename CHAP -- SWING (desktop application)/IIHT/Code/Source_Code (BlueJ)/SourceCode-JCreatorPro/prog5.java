import java.io.*;

class prog3
{
	public static void main (String[] args)throws IOException 
	{
		String str;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a string: ");
		str = in.readLine(); 
			
		StringBuffer m = new StringBuffer(str);
	//	StringBuffer n = new StringBuffer("JAVA");
		
		m.delete(5,8);
		System.out.println(m);
	}
}
