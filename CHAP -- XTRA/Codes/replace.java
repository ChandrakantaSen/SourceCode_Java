import java.io.*;
public class replace
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String sen,st1,st2,srchwrd,repwrd;st2="";
System.out.println("Enter the String");
sen=br.readLine();
System.out.println("Enter the word to search in the String");
srchwrd=br.readLine();
System.out.println("Enter the new word");
repwrd=br.readLine();
st1=sen+" ";
int l=st1.length();
for(int i=0;i<l;i++)
{
if(st1.charAt(i)==' ')
{
st2=st1.substring(0,i);
continue;
}
if(st2.equals(srchwrd)==true)
{
st2=repwrd;
}
System.out.println("The new string is"+st1);
}
}
}