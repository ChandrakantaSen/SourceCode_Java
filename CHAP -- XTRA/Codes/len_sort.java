import java.io.*;
class len_sort
{
	public static void main(String args[]) throws IOException
	{
          String a[][]= new String [5][5];
          String temp;
	   	  BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	   	  for(int i=0;i<5;i++)
	   	  {    
	   	    	System.out.print("Enter Name : ");
	   	    	a[i][0]=obj.readLine();
	   	  }    
	   	  System.out.println("The Names are in Sort Form "); 
	   	  for(int i=0;i<5-1;i++)
	   	  {
	   	     for(int j=i+1;j<5;j++)
	   	      {
	   	      	if(a[i][0].length()>a[j][0].length())
	   	      	{
	   	            temp=a[i][0]; 		
	   	            a[i][0]=a[j][0];
	   	            a[j][0]=temp;	
	   	      	}
	   	     }	   	      
	   	  }
	   	  for(int i=0;i<5;i++)
	   	  {    
	   	    	System.out.println(a[i][0]);
	   	  }	   	  	
	}
}   	  	