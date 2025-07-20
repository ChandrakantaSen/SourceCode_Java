import java.io.*;
class Word
{
public static void main(String args[])throws IOException
{
int k,y;
String st;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a NAME:>>>");
st=br.readLine();
k=st.length();
for(y=0;y<k;y++)
{
for(int m=(6-y);m>0;m--)
{
System.out.print(" ");
}
for(int l=0;l<=y;l++)
{
char r=st.charAt(l);
System.out.print(r+" ");
}
System.out.println();
}
}
}