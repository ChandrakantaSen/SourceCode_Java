import java.io.*;
class queue_string
{
    static String ar[]=new String[5];
    static String x;
    static int front=-1,rear=-1,c,ch,i;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
          do
            {
                System.out.println("QUEUE________STRING");
                System.out.println("1.push\n2.pop\n3.display\n4.exit");
                ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1 :
                    System.out.println("Enter a name ");
                    x=br.readLine();
                    push(x);
                    break;
                    case 2 :
                    pop();
                    break;
                    case 3 :
                    System.out.println("the queue as follows ");
                    for(i=front;i<=rear;i++)
                    {
                    System.out.println(ar[i]);
                    }   
                    break;
                    case 4 :
                    System.out.println("The End");
                    System.exit(0);
                    default : 
                    System.out.println("Wrong Choice");
                }
                System.out.println("want to continue");
                c=Integer.parseInt(br.readLine());
            }
            while(c==1);
    }
    static void push(String x)
    {
        if(rear==5-1)
        {
            System.out.println("queue is overflowed");
            System.exit(0);
        }
        else
        {
            rear++;
            ar[rear]=x;
            if(rear==0)
            {
                front=0;
            }
        }
        System.out.println("the queue as followed ");
        for(i=front;i<=rear;i++)
        {
            System.out.println(ar[i]);
        }
    }
    static void pop()
    {
        if(rear==front-1)
        {
            System.out.println("the queue is underflowed");
            System.exit(0);
        }
        else
        {
            System.out.println("The deleted item is : - "+ar[front]);
            front++;
        }
    }
}