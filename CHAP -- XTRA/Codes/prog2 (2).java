import java.io.*;
class prog2
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("INPUT A SENTENCE");
        String str=br.readLine();
        int l=str.length();
        int c=0;
        for(int i=0;i<l-1;i++)
        {char ch=str.charAt(i);char ch1=str.charAt(i+1);
            if(ch==ch1)
            {
                c++;
                System.out.println(str.charAt(i)+" "+str.charAt(i+1));
                
            }
            
        }
       System.out.println("no of consecutive letters"+"\t"+c);  
    }
}
                
                
        
        
        
    