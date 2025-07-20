import java.io.*;
class stacks1
{
    static int ar[]=new int[100],top=-1,x,ch,i;
    static int c,n;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws IOException
    {
          do
          {
                n=5;
                System.out.println("STACKS");
                System.out.println("1.push\n2.pop\n3.display\n4.exit");
                ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1 :
                    System.out.println("Enter a value ");
                    x=Integer.parseInt(br.readLine());
                    push(x);
                    break;
                    case 2 :
                    pop();
                    break;
                    case 3:
                    System.out.println("the stack as follows ");
                    for(i=top;i>=0;i--)
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
    static void push(int x)
    {
        if(top==n-1)
        {
            System.out.println("stack is overflowed");
            System.exit(0);
        }
        else
        {
            top++;
        ar[top]=x;
}
        System.out.println("the stack as followed ");
        for(i=top;i>=0;i--)
{
        System.out.println(ar[i]);
}
    }
static void pop()
    {
        if(top==-1)
        {
            System.out.println("the stack is underflowed");
            System.exit(0);
        }
        else
        {
        System.out.println("the deleted element is"+ar[top]);
        top--;
}
    }
}