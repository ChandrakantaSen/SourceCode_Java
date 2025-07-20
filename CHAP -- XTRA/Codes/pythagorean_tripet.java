import java.io.*;
class pythagorean_tripet
{
public static void main(String args[])throws IOException
{
int h,p,b;
double a,c,d;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the thre nos. to be check");
h=Integer.parseInt(br.readLine());
p=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
a=Math.pow(h,2);
c=Math.pow(p,2);
d=Math.pow(b,2);
if((a==c+d)||(a+c==d)||(d+a==c))
{
System.out.println("Pythagorean Triplet");
    }
    else
    {
        System.out.println("It is not a Pythagorean Triplet");
    }
}
    }