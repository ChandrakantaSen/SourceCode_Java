class Aseven
{
  public static void main(int n)
  {
      int a=1,b=0,c,i,m=1;
      for(i=1;i<=n;i++)
       {
           c=a+b;
           m=m*c;
           
           a=b;
           b=c;
        }
           
        System.out.print(m);
    }
}
