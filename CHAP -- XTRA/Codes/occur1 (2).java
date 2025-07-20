import java.io.*;
class occur1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader string_obj = new BufferedReader(new InputStreamReader(System.in));
		int count;

System.out.println("enter a string");
String s=string_obj.readLine();
int l=s.length();
for(int i=0;i<l;i++)
{
if(s.charAt(i)==' ')
continue;
count=1;
for(int j=i+1;j<l;j++)
{
if(s.charAt(i)==s.charAt(j))
count++;
//s[j]=' ';
for(int k=0;k<l;k++)
{
   

System.out.println("occurance of"+ "\t"+count);
    }
    }
}
    }
}