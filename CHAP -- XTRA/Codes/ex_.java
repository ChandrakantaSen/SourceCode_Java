import java.io.*;
class ex_
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,m=0,c=1,j,m1;
String s,k,t4="",t1="",t2="",t3="";
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
t4=k;
c=0;
System.out.print(t3+" "+t4+" "+t1+" "+t2+" ");
}
    
else if(c==1)
{
t1=k;
    }
else if(c==2)
{
t2=k;
    }
    
else if(c==3)
{
t3=k;
    }
    c++;
 
    }
}
if(c==4)
{
System.out.print(t3+" "+t2+" "+t1+" ");
         }

if(c==3)
{
System.out.print(t1+" "+t2+" ");
         }
if(c==2)
{
System.out.print(t1+" ");
         }

}
}
  
   