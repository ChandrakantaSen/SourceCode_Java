import java.io.*;
class Stat
{
int a[];

double m,sd;
Stat() 
{
 m=0;sd=0;


    }
    int mean() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];

        for(int i=0;i<10;i++)

{
System.out.println("enter no.");
 a[i]=Integer.parseInt(br.readLine());


}
        int r=0;
        
        for(int i=0;i<10;i++)
{
    r=r+a[i];
}
       
      m=r/10.0;  
      return 1;
}
void dev() throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [10];

        for(int i=0;i<10;i++)

{
System.out.println("enter no.");
 a[i]=Integer.parseInt(br.readLine());


}
        int r=0;
        
        for(int i=0;i<10;i++)
{
    r=r+a[i];
}
       
      m=r/10.0;  
 for(int i=0;i<10;i++)
{

 sd=m-a[i];
 System.out.println(sd);
    }
}
    }
    
   

    
      


    