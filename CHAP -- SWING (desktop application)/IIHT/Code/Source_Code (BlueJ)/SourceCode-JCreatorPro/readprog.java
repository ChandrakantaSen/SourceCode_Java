import java.io.*;
import java.util.*;
class readprog
{
	public static void main (String[] args) throws IOException
		{
			FileReader fr = new FileReader("myfile2.txt");
			BufferedReader br = new BufferedReader(fr);
			String name,s="";
			int i =0;
			while((name=br.readLine())!=null)
			{
				i++;
				//System.out.println("name: "+ i+" ");
				System.out.println(name);
				s=name;
				//i++;
			}
			
			System.out.print(s);
		}
}