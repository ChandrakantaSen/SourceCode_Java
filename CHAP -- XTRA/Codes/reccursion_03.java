import java.io.*; 
class reccursion_03
{
public static int fibo (int i)
{
if (i==0)
{
return 0;
    }
else if ((i==1)||(i==2))
{
return 1;
    }
else
{
return ((i-1)+(i-2));    
}
    }
public static void main (String args[]) throws IOException
{
int m;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Please enter the limit whose series  is to be found");
m=Integer.parseInt (br.readLine());
System.out.println ("The fibonacci of the " +m+ "is:-");
for (int j=0;j<=m;j++)
{
System.out.println (fibo(j));    
    }
}
    }