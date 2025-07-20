/*
 * Multiple class array problem
 */
 
import java.util.*;

class Sample
{
	int i;
	int p[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter the elements: ");
		for(i=0;i<p.length;i++)
		{
			p[i] = sc.nextInt();
		}
	}
	
	public void show()
	{
		System.out.println("Array elements are: ");
		for(i=0;i<p.length;i++)
		{
			System.out.println(p[i]+" ");
		}
	}
}

class Code3
{
	public static void main (String[] args) 
	{
		Sample sObj = new Sample();
		sObj.input();
		sObj.show();
	}
}