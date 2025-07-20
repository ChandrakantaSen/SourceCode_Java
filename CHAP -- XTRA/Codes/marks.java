import java.io.*;
class marks
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,p,j,x,y,z;
        String c;
        String s[]=new String[10];
        int n[]=new int[10];
        for(i=0;i<10;i++)
        {
        System.out.println("Enter the name:");
        s[i]=br.readLine();
        System.out.println("Enter the marks in 1st Subject:");
        x=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks in 2nd Subject:");
        y=Integer.parseInt(br.readLine());
        System.out.println("Enter the marks in 3rd Subject:");
        z=Integer.parseInt(br.readLine());
        n[i]=x+y+z;
        }
        for(i=0;i<9;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(n[i]<n[j])
                {
                    p=n[i];
                    n[i]=n[j];
                    n[j]=p;
                    c=s[i];
                    s[i]=s[j];
                    s[j]=c;
                }
                
            }
        }
        System.out.println("Name            Total Marks");
        System.out.println("====            ===== =====");
        for(i=0;i<10;i++)
        {
        
        System.out.print(s[i]);
        System.out.print("               ");
        System.out.println(n[i]);
        }
    }
}