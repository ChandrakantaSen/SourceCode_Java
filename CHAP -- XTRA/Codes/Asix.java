import java.io.*;
class Asix
{
public static void main(int n)
  {
      int i,m,s=0,j;
      for (i=1;i<=n;i++)
      {
          m=1;
          for(j=1;j<=i+2;j++)
          m=m*(i+1);
          s=s+i*m;
        }
          System.out.print(s);
        }
    }

