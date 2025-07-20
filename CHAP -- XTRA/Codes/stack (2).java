import java.io.*;
class stack
    {
   static  int top;
  static int n;
   static int arr[]=new int[20];
        stack( int a)
        {top=-1;
             n=a;
            int arr[]=new int[n];
        }
        
 // static int arr[]=new int[5];       
       static   void push(int x)
         {
             if(top==n-1)
             {//System.out.println((n-1));
            System.out.println("stack overflow");
        }
            else
            {
                ++top;
                arr[top]=x;
                  }
            }
            
          static   void pop()
            {
                if(top==-1)
                {
                 System.out.println("stack underflow");
                }
                 else
                 {
                   System.out.println("The deleted element is: "+arr[top]);          
             top--;
            }
        }
           static void display()
            {
                for(int i=top;i>=0;i--)
                {
                System.out.print( arr[i]+" ");
            }
                System.out.println();
            }
            
            public static void main(String args[])throws IOException
            {
                int fl=0,b;
                InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("Enter the length of the array");
int n1=Integer.parseInt(br.readLine());
stack ob=new stack(n1);
//System.out.println((arr.length));
while(fl==0)
{
System.out.println("STACKS");
System.out.println("1.enter 1 to push");
System.out.println("2.enter 2 to pop");
System.out.println("3.enter 3 to display ");
System.out.println("4.enter 4 to exit");
System.out.println("enter your choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("enter a no.");
 b=Integer.parseInt(br.readLine());
push(b);
display();
break;

case 2:
pop();
display();
break;

case 3:
display();
break;

case 4:
fl++;
break;

default:
System.out.println("invalid choice. try again.");
break;
    }

    }
}
    }

    