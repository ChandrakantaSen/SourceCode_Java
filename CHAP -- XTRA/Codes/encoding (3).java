    import java.io.*;
    class decode
    {
    	public static void main (String args[])throws IOException
    	{
    		int b,c,p=0,m=0,l,i,j,n,d=0,r=0;
    		String s;
    		InputStreamReader x=new InputStreamReader(System.in);
    		BufferedReader y= new BufferedReader (x);
    		System.out.println("ENTER THE LENGTH OF THE CODE");
    		n=Integer.parseInt(y.readLine());
    	    if(n>6)
    	    {
    	    	p=-1;
    	    	System.out.println("INVALID_length should not exceed 6  characters");
    	    }
    	    if(n<=6)
    	    {
    	    	System.out.println("ENTER THE CODE");
    	       s=y.readLine();
    	       l=s.length();
    	       if(n!=l)
    	       {
    	       	d=-1;
    	       	System.out.println("INVALID_length not same as specified");
    	       	}
    	       for(i=0;i<l-1;i++)
    	       {
    	       	for(j=i+1;j<l;j++)
    	       	{
    	       		b=(int)s.charAt(i);
    	       		c=(int)s.charAt(j);
    	       		if(b>=97 && b<=122)
    	       		{
    	       			p=-1;
    	       			}
    	       			if(p==-1 && d==0)
    	       			{
    	       			System.out.println("INVALID_only uppercase letters permitted");
    	       			d=-1;
    	       			}
    	       		if(b==c)
    	       		{
    	       			r=-1;
    	       			if(r==-1 && d==0)
    	       			{
    	       			System.out.println("INVALID_repetition of characters not allowed");
    	       			d=-1;
    	       			}
    	       		}	
    	       	}
    	       }
    	       if(d!=-1)
    	       {
    	       for(i=0;i<l-1;i++)
    	       {
    	       	b=(int)s.charAt(i);
    	       	c=(int)s.charAt(i+1);
    	       	if(c!=(b+2))
    	       	{
    	       		m=-1;
    	       	}
    	       }
    	     if(m==0)
    	     {
    	     	System.out.println("VALID");
    	     }  
    	     else
    	     {
    	     	System.out.println("INVALID_only alternate letters valid"); 
    	     }
    	    }
    	    }
    		}
    		}
