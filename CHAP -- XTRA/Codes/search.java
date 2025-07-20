import java.io.*;
class search
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name[]=new String[10];
      int roll[]=new int [10];
      int n;
      System.out.println("enter the name of ten students and their roll number");
      for(int i=0;i<10;i++)
      {
          name[i]=br.readLine();
          roll[i]=Integer.parseInt(br.readLine());
       }
       System.out.println("enter the searching roll number");
      n=Integer.parseInt(br.readLine()); 
       for(int i=0;i<10;i++)
       {
           if(n==roll[i])
           {
               System.out.println("name ="+name[i]+"\n"+"roll="+roll[i]);
            }
        }
    }
}