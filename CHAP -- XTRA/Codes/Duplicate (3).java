package All;

import java.io.*;
public class Duplicate
{
    void readList()throws IOException    
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int num[]=new int[10];
   
        
        System.out.println("Enter numbers in the array in sorted form");
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            num[i]=Integer.parseInt(in.readLine());
        }
        packList(num);
    }
    void packList(int num1[])
    {
        Duplicate t=new Duplicate();
        int num2[]=new int[10];
         int i,x,j,k=0;
        x=num1[9];
        for(i=0;i<=x;i++)
        {
            for(j=0;j<10;j++)
            {
                if(i==num1[j])
                {
                   if(k==0)
                   {
                   num2[j]=i;k++;
                   }          
                             
                //k++;
               }
            }
        k=0;
       }
    t.dispList(num2);
}
void dispList(int num3[])
{
    int a;
    for(a=0;a<10;a++)
    {
        if(num3[a]>0)
        System.out.println(num3[a]);
    }
}
}
        
                
                
        
        
        
        
      