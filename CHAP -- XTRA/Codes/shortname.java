
import java.io.*;

class shortname
{
	public static void main(String args[])throws IOException
	{
		String name;
		int i,n,c=0;
                BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
	    name=obj.readLine();
	    n=name.length();
	    for(i=0;i<n;i++)
	    {
	    	if(i==0)
	    	System.out.print(name.charAt(0));
	    	if(name.charAt(i)==' ')
	    	{
	    		System.out.print("."+name.charAt(i+1));
                c=i+1;
	    	}
	    }
	    for(i=c+1;i<n;i++)
	    System.out.print(name.charAt(i));
          
	 }
}
