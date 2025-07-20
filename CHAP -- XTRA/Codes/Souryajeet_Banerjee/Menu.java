import java.io.*;
class Menu
{
    BufferedReader br;
    int arr[]=new int[10];
    public static void main(String args[])throws IOException
    {
        Menu ob=new Menu();
        ob.accept();
    }
    Menu ()
    {
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    public void accept()throws IOException
    {
        int choice;
        for(int i=0;i<10;i++)
        {
            System.out.println ("Enter number:");
            arr[i]=Integer.parseInt(br.readLine().trim());
        }
        System.out.println("Enter Your Choice '1' for adding even numbers, '2' for adding odd number :");
        choice=Integer.parseInt(br.readLine().trim());
        if(choice==1)
            addEven();
        else if(choice==2)
            addOdd();
        else
        System.out.println( "Wrong Choice:");
    }
    private void addEven()
    {
        int sum=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
                sum=sum+arr[i];
        }
        System.out.println("Sum of Even Numbers= "+sum);
    }

    private void addOdd()
    {
        int sum=0;
        for(int i=0;i< 10;i++)
        {
            if(arr[i]%2!=0)
                sum=sum+arr[i];
        }
        System.out.println("Sum of Odd Numbers="+sum);
    }
}