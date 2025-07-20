class Atwo
{
  public static void main(int n)
    {
        int i,s=0;
        for(i=1;i<=n*2;i=i+2)
          s=s+(i*(i+1)/(i+2));
          System.out.print(s);
        }
    }
    