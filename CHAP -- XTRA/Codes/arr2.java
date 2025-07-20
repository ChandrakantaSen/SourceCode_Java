import java.io.*;
class arr2
{
 public static void main(String args[])throws IOException
 {
     InputStreamReader inp=new InputStreamReader(System.in);
     BufferedReader red=new BufferedReader(inp);
     int gt=0,n;
     System.out.println("enter how many names?");
    
     n=Integer.parseInt(red.readLine());
      String name[]=new String[n];
     System.out.println("enter number of subjects");
     n=Integer.parseInt(red.readLine());
     int num[]=new int[n];
    
     int sub[]=new int[n];
     for(int i=0;i<n;i++)
     {
         
         System.out.println("Enter names:");
         name[i]=red.readLine();
         System.out.println("Enter subject marks:");
         sub[i]=Integer.parseInt(red.readLine());
      }
      for(int i=0;i<n;i++)
        {
            gt=gt+sub[i];
         System.out.println("grand total is"+gt);
         
         System.out.println("Names="+name[i]);
         // System.out.println("Grand Total="+gt);
        }
 }
} 
         
     
     