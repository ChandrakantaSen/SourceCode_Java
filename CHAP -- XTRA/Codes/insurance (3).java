import java.io.*;   
class insurance
{
    public static void main(String args[])throws IOException
    {
        int age;
        char sex;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age of the person ");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter the sex of the person ");
        sex=(char)br.read();
        if((sex=='M')||(sex=='m'))
        {
            if(age>=30)
            {
                System.out.println("HE IS INSURED");
            }
            else
            {
                System.out.println("HE IS NOT INSURED");
            }
        }
        else if((sex=='F')||(sex=='f'))
        {
            if(age>=25)
            {
                System.out.println("SHE IS INSURED");
            }
            else
            {
                System.out.println("SHE IS NOT INSURED");
            }
        }
        else
        {
            System.out.println("WRONG INPUT");
        }
    }
}