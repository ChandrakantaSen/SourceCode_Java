import java.io.*;
class Manager extends Emp
{
    int eno,i,n;
    Manager(int Num,String Nme,String Adr,String Depa,int en)
    {
        super(Num,Nme,Adr,Depa);
        eno=en;
        
    }
    public void man()throws IOException
    {
        System.out.println("Enter the number of employees working under a manager : ");
        eno=Integer.parseInt(br.readLine());
        for(i=eno;i>0;i--)
        {
            System.out.println("Enter the details for employee "+i+" : ");
            super.display();
        }
    }
}