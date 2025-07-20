import java.io.*;
class stacks
{
    static int ar[]=new int[10],top=-1,x,ch,i;
    static char c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void main(String args[])
    {
        try
		{
            do
            {
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
                    case 3 :
                    System.out.println("the stack as follows ");
                    for(i=0;i<top;i++)
                    System.out.println(ar[i]);
                    break;
                    case 4 :
                    System.out.println("The End");
                    System.exit(0);
                    default : 
                    System.out.println("Wrong Choice");
                }
                System.out.println("want to continue");
                c=(char)System.in.read();
            }
			while(c=='y'||c=='y');
		} catch(Exception e){};
	}
	void push(int x)
	{
		if(top==10-1)
		{
			System.out.println("stack is overflowed");
			System.exit(0);
		}
		else
		ar[++top]=x;
		System.out.println("the stack as followed ");
		for(i=0;i<=top;i++)
		System.out.println(ar[i]);
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("the stack is underflowed");
			System.exit(0);
		}
		else
		System.out.println("the deleted element is"+ar[top=-1]);
	}
}