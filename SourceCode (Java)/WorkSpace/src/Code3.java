import java.util.*;
class Code3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s,st="",pw="";char c,ch=' ';int i,len,l,j;
System.out.println("Enter the String");
s=in.nextLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c!=' ')
{
st=st+c;//create word
}
else
{
len=st.length();
for(j=(len-1);j>=0;j--)
{
ch=st.charAt(j);
pw=pw+ch;
}
System.out.print(pw+" ");
st="";pw=""; 
}
}
}
}