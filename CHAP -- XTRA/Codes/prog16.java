import java.io.*;
class prog16
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void main()throws IOException
{int x=Integer.parseInt(br.readLine());
    for (int i=2;i<=x/2;i++)
    if (x%i==0)
    System.out.println("the no.is not prime");
    else System.out.println("the no.is  prime");
}
}