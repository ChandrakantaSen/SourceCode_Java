import java.io.*;
import java.util.*;

class prog3
{
	public static void main (String[] args)throws IOException 
		{
			String chr,stringreplace1,old1,old2,new1,new2,rplc;
			
			 StringBuffer m = new StringBuffer(12);
			 
			 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.print("enter a string: ");
			 chr=in.readLine();
			 
			 System.out.println("enter old words : ");
			 old1=in.readLine();
			
			// old2=in.readLine();
			// rplc2=in.readLine();
			 System.out.println("enter new words : ");
			 new1=in.readLine();
			// new2=in.readLine();
			 stringreplace1=chr.replace(old1,new1);
			 //stringreplace1=chr.replace(old2,new2);
			 System.out.println(stringreplace1);
			 StringBuffer p = new StringBuffer("the");
			 m.insert(3,p);
			 System.out.println(stringreplace1);
			 
		}
}