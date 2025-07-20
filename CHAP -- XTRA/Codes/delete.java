import java.io.*;
class delete
{
    public static void main(String args[]) 
    {
        int i,num;
        int m[]=new int[30];
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read); 
        
        System.out.println("Enter the no of elements: ");
        num = Integer.parseInt(in.readLine());
        
        System.out.println("Enter the elements: ");
        for(i=0;i<num;i++)
	{
		m[i]=Integer.parseInt(in.readLine());
	}
	
	System.out.println("Enter element to be inserted: ");
	e = Integer.parseInt(in.readLine());
		
	System.out.println("Enter the location: ");
	loc = Integer.parseInt(in.readLine());
	
	while(loc<e)
	{
	    m[loc-1]=m[]
	}
        
    }
}
