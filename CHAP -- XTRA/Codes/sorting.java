// SORTING OF NUMBERS SELECTION SORT ALGORITHM
import java.io.DataInputStream;
class sorting
{
	public static void main(String args[])
	{
		DataInputStream in= new DataInputStream(System.in);
		int n[]=new int[10];
		int i,j;
		try{
			for(i=0;i<10;i++)
			{
			System.out.print("Enter Number :");
			n[i]=Integer.parseInt(in.readLine());				 										
	        }
	        
	        for(i=0;i<9;i++)
	        {
	        	for(j=i+1;j<10;j++)
	        	{
	        		if(n[i]<n[j])
	        		{
	        			int temp=n[i];
	        			n[i]=n[j];
	        			n[j]=temp;
	        		}
	        	}
	        }
	      System.out.println("The Values are in Sorted Order\n\n");
	      for(i=0;i<10;i++)
	      {
	      	System.out.print(n[i]+" ");
	      }    
	      
		 }
		catch(Exception e)
		{ 
			System.out.println("Error in Input ");		
		}
		finally
		{
			System.out.print("End of Program");
		}
	}
}

