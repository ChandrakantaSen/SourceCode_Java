import java.io.*;
class Menudriven
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a,b,c,ch;
            System.out.println("Enter first number");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter second number");
            b=Integer.parseInt(br.readLine());
            System.out.println("Enter choice(1/2/3/4)");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("Addition result is"+(c=(a+b)));
                break;
                case 2:
                System.out.println("Subtraction result is"+(c=(a-b)));
                break;
                case 3:
                System.out.println("Multiplication result is"+(c=(a*b)));
                break;
                case 4:
                System.out.println("division result is"+(c=(a/b)));
                break;
                default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }
               