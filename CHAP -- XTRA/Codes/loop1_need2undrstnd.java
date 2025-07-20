import java.io.*;
public class loop1_need2undrstnd
{
public static void main(String[]args)throws IOException
{
int a,b,i,c;c=0;
BufferedReader qads =new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter name");
	    String name=qads.readLine();
	    a=name.length();
	    for(i=0;i<a;i++)
	    {
	    	if(i==0)
	    	System.out.print(name.charAt(0));
	    	if(name.charAt(i)==' ')
	    	{
	    		System.out.print("."+name.charAt(i+1));
                c=i+1;
	    	}
	    }
	    for(i=c+1;i<a;i++)
	    System.out.print(name.charAt(i));
          
	 }
}
