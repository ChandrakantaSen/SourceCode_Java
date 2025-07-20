import java.io.*;
class fi
 {
 void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());int f=0,s=1;
        System.out.println(f);
             System.out.println(s);
        for(int i=0;i<=x;i++)
        {  int t=f+s;
            f=s;s=t;
            
              System.out.println(t);
            }
        }
    }