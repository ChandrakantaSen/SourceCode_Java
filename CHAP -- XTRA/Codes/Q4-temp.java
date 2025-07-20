import java.io.*;
class Q4
{
    public static void main() throws IOException
    {
        int i,ch,n;
        double s=0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.First Series ");
        System.out.println("2.Second Series");
        System.out.println("Enter your choice :- ");
        ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
                      System.out.println("Enter the limit :- ");
                      n=Integer.parseInt(br.readLine());;
                      for(i=1;i<=n;i++)
                      {
                          s = s + Math.pow(i,2)-1;
                      }
                      System.out.println("Sum of the Series is :- "+s);
                      break;
            case 2:
                     for(i=1;i<=20;i+=2)
                      {
                          s = s + (double)i/(double)(i+1);
                      }
                      System.out.println("Sum of the Series is :- "+s);
                      break;
            default :
                      System.out.println("It's a Wrong choice");
        }
    }
}
