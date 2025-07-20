import java.io.*;
class krishnamurthy {
      int fact(int n) {
            int i,p=1;
            for(i=n;i>=1;i--)
            p=p*i;
            return p;
      }
      void krishna()throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int a,b,s=0;
            System.out.print("Enter the number : ");
            a=Integer.parseInt(br.readLine());
            System.out.print("\n");
            int n=a;
            while(a>0) {
                  b=a%10;
                  s=s+fact(b);
                  a=a/10;
            }
            if(s==n)
            System.out.print(n+" is a krishnamurthy number");
            else
            System.out.print(n+" is not a krishnamurthy number");
      }
} //- See more at: http://icse-java.blogspot.in/2011/09/to-check-whether-number-is-krishna.html#sthash.Vo3vDpAz.dpuf