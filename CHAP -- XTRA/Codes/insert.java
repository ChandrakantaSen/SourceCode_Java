import java.io.*;
class insert
{
	public static void main (String[] args)throws IOException
	{
		int m[]=new int[30];
		int i,num,loc,e;
		
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		
		System.out.println("Enter the number of elements: ");
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
		
		//create space
		for(i=num;i>=loc;i--)
		{
			m[i]=m[i-1] ;
		}
		num++;
		m[loc-1]=e;
		
		//print the array
		for(i=0;i<num;i++)
		{
			System.out.print(m[i]+" ");
		}
	}       
}