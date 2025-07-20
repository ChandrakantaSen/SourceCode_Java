import java.io.*;
class prog1
{
void display()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    int p=Integer.parseInt(br.readLine());
  int sum=p*(p+1)/2;
int avg=sum/p;
}
}    