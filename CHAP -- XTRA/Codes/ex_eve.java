import java.io.*;
class ex_eve
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,m=0,c=1,j,m1;
String s,k,f="",z,t="",t1="";
System.out.println("Enter a sentence ");
s=buf.readLine();
s=s+" ";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(m,i);

m=i+1;

if(c==4)
{
f=f+k+" ";
c=0;
m1=f.length()-1;
for(j=f.length()-2;j>=0;j--)
{
if(f.charAt(j)==' ')
{
z=f.substring(j+1,m1);
System.out.print(t+" "+z+" ");
z=f.substring(0,j);
System.out.print(t1+" "+z+" ");
j=0; 
}
    }
f="";
}
else if(c==1)
{
t=k;
    }
else if(c==2)
{
f=f+k+" ";
    }
    
else if(c==3)
{
t1=k;
    }
    c++;
 
    }
}
if(c==4)
{
System.out.print(t+" "+f+" "+t1);
         }

if(c==3)
{
System.out.print(t+" "+f+" ");
         }
if(c==2)
{
System.out.print(t+" ");
         }

}
}
    
   