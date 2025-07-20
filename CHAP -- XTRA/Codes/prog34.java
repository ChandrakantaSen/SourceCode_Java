import java.io.*;
  class prog34
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void main()throws IOException
{int x=Integer.parseInt(br.readLine());int c=0;
  for (int i=2;i<=x;i++)  
   { 
       for (int j=2;j<=i/2;j++)
        {
            if (i%j==0)
            c++;
        }
       if(c==0)
        System.out.println(i);  c=0;  
}
}
}