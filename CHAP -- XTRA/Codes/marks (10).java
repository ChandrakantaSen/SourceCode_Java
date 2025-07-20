import java.io.*;
public class marks
{
 public static void main(String args[])throws IOException
 {
     int marks[]=new int[10];
     String name[]=new String[10];
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int i,j,t, tstr;
     for(i=0;i<10;i++)
     {
         System.out.println("Enter the names");
         name[i]=br.readLine();
        
         System.out.println("Enter the marks");
         marks[i]=Integer.parseInt(br.readLine());
        int l=name[i].length();
    }
        for(i=0;i<9;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(marks[i]>marks[j])
                {
                    t=marks[i];
                    marks[i]=marks[j];
                    marks[j]=t;
                }
                if(name[i]>name[j])
                {
                    tstr=name[i];
                    name[i]=name[j];
                    name[j]=tstr;
                }
            }
        }
        for(i=0;i<10;i++)
        {
            System.out.println(marks[i]);
            System.out.println(name[i]);
        }
    }
}
