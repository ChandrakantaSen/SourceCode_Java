import java.io.*;
class bkprg12
{
public static void main(String args[])throws IOException
{
String name[]=new String[11];
int runs[]=new int[11];
int i,j,t;
String n;
int m[]=new int[11];
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
for(i=0;i<11;i++)
{
System.out.println("Enter the name of the players: -");
for(i=0;i<11;i++)
{
name[i]=br.readLine();
    }
System.out.println("Enter the run of the players: -");
for(i=0;i<11;i++)
{
runs[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("Players \t\t Runs");
    for(i=0;i<11;i++)
    {
    System.out.println(name[i]+"\t\t\t"+runs[i]);
}
for(i=0;i<10;i++)
{
for(j=0;j<(10-i);j++)
{
if(m[i]>m[j+1])
{
t=m[j];
m[j]=m[j+1];
m[j+1]=t;
n=name[j];
name[j]=name[j+1];
name[j+1]=n;
    }
}
    }
    System.out.println("Name of the Player \t\t\t Runs scored");
   for(i=0;i<11;i++)
{
System.out.println(name[i]+" \t\t\t "+m[i]);
    }
}
    }
}