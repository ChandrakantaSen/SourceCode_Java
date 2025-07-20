import java.io.*;
class ex_odd
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,m=0,c=1,j,m1;
String s,k,f="",z,t="";
System.out.println("Enter a sentence ");
s=buf.readLine();
s=s+" ";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(m,i);

m=i+1;

if(c==3)
{
f=f+k+" ";
c=0;
m1=f.length()-1;
for(j=f.length()-2;j>=0;j--)
{
if(f.charAt(j)==' ')
{
z=f.substring(j+1,m1);
System.out.print(z+" "+t+" ");
z=f.substring(0,j);
System.out.print(z+" ");
j=0; 
}
    }
f="";
}
else if(c==1)
{
f=f+k+" ";
    }
else if(c==2)
{
t=k;
    }
    c++;
 
    }
}
if(c==3)
{
System.out.print(f+" "+t+" ");
         }
if(c==2)
{
System.out.print(f+" ");
         }

}
}
    
   