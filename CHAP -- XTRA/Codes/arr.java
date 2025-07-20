import java.io.*;
class arr
{
 public static void main()throws IOException
 {
     InputStreamReader inp=new InputStreamReader(System.in);
     BufferedReader red=new BufferedReader(inp);
     int gt=0;
     String name[]=new String[5];
     int sub[]=new int[5];
     for(int i=0;i<5;i++)
     {
         System.out.println("Enter 5 marks:");
         sub[i]=Integer.parseInt(red.readLine());
         System.out.println("Enter 5 names:");
         name[i]=red.readLine();
      }
      for(int i=0;i<5;i++)
        {
         System.out.println("Subject marks are="+sub[i]);
         gt=gt+sub[i];
         System.out.println("Names="+name[i]);
        } System.out.println("Grand Total="+gt);
 }
} 
         
     
     