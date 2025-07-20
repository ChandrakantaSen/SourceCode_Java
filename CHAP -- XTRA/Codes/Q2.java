import java.io.*;
class Q2
{
    public static void main() throws IOException
    {
        int l,b,ch;
        double v=0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length and Breadth of a Rectangle :- ");
        l = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        System.out.println("1.Area of the Rectangle");
        System.out.println("2.Perimeter of the Rectangle");
        System.out.println("3.Diagonal of the Rectangle");
        System.out.println("Enter your choice :- ");
        ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
                      v = l * b;
                      System.out.println("Area of the Rectangle is "+v);
                      break;
            case 2:
                      v = 2*(l + b);
                      System.out.println("Perimeter of the Rectangle is "+v);
                      break;
            case 3:
                      v = Math.sqrt(l*l + b*b) ;
                      System.out.println("Diagonal of the Rectangle is "+v);
                      break;
            default :
                      System.out.println("It's a Wrong choice");
        }
    }
}