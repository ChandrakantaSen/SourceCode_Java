    import java.io.*;
    class PerfectNumber
    {
        int no,sum=0,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        public void takeNumber()throws Exception
        {
            System.out.println("Enter the number:");
            no=Integer.parseInt(br.readLine());
            for(i=1;i< no;i++)
            {
                if(no%i==0)
                sum=sum+i;
            }
            if(sum==no)
            System.out.println(no + " is a perfect number");
            else
            System.out.println(no + " is not a perfect number");
        }
        public static void main(String args[])throws Exception
        {
            PerfectNumber obj=new PerfectNumber ();
            obj.takeNumber();
        }
    }