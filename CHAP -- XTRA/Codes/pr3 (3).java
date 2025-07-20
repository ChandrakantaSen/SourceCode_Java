import java.io.*;
class pr3
{
public static void main(String args[]) throws IOException
{
int nr;
int ns;
int r=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//String in;
System.out.println("\n how many rows");
//nr=br.readLine();
nr=Integer.parseInt(br.readLine());

System.out.println("\n how many stars per row");
//in=br.readLine();
ns=Integer.parseInt(br.readLine());

while(r<=nr)
//for(r=1;r<=nr;r++)
{
int star=1;
while(star<=ns)
//for( int star=1;star<=ns;star++)
{
System.out.print("*");
star=star+1;
}
System.out.println();
r=r+1;
}
}
}


