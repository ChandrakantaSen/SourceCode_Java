import java.io.*;

class names
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s,n=" ",b=" ",c,m=" ",x=" ";
	int p=0,s1=0,s2,s3;
	System.out.println("enter ur name");
	s=br.readLine();
	
	int l=s.length();
	for(int i=0;i<l;i++)
	{
	    if(s.charAt(i)==' ')
	    c=s.substring(0,i);

	    p=i+1;
	    m=s.substring(p);
	   }
	    System.out.println();
	   }
}
	