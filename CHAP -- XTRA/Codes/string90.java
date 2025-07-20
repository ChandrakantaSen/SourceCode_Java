import java.io.*;
class string90
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="",g="",p="",t="";
int i,l,c=0,ch,d,j,r;
do
{
System.out.println("...........Menu........");
System.out.println("Press 1 for reversing the letters of the string");
System.out.println("Press 2 for replacing the vowels of the string with #");
System.out.println("Press 3 for shifting the first letter of the string");
System.out.println("Press 4 for exit");
System.out.println("Enter the choice ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter the string");
s=br.readLine();
s=s.toUpperCase();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
System.out.println("The reversed string is"+k);
break;
case 2:
System.out.println("Enter the string");
s=br.readLine();
s=s.toUpperCase();
l=s.length();
for(i=0;i<l;i++)
{
if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U'))
{
g=g+"#";
    }
    else
    {
        g=g+s.charAt(i);
    }
}
  System.out.println("The new string is"+g);
  g="";
        break;
        case 3:
        c=0;
        System.out.println("Enter the string");
s=br.readLine();
s=s.toUpperCase();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{

if(s.charAt(i)==' ')
{
p=s.substring(c,i);
c=i+1;
    
d=p.length();
j=(int)(p.charAt(0));
j=j+3;
if(j>90)
{
j=j-26;
    }
    t=t+(char)(j);
    for(r=1;r<d;r++)
    {
        t=t+p.charAt(r);
    
    }
   System.out.println("the new string is:"+t);
   p="";
   t="";
}

}
    
    
    
    break;
    case 4:
    System.out.println("Bye Bye");
    System.exit(0);
    break;
    default:
    System.out.println("Wrong input");
    break;
}
    }
while(true);
    }
}
    