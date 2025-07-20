package Project;
import java.io.*;
class Report
{
    String name[]=new String[100];
    String roll[]=new String[100];
    int marks[][]=new int[100][9];
    int std;
    /* (unit1,unit2,block,total)*2 plus grand total*/
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i;
    public void setMarks() throws IOException
    {
        System.out.println("How many students?:");
        std=Integer.parseInt(br.readLine());
        for(i=0;i< std;i++)
        {
            System.out.println("Enter Name of Student No " +(i+1) + ":");
            name[i]=br.readLine();
            System.out.println("Enter Roll No:");
            roll[i]=br.readLine();
            System.out.println("Semester 1");
            sem1();
            System.out.println("Semester 2");
            sem2();
        }
        sort();
    }
    private void sem1() throws IOException
    {
        int m,n;
        int d=0,d1=0;
        System.out.println("Unit1");
        for(m=0;m< 10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][0]=d;
        d=0;
        System.out.println("Unit2");
        for(m=0;m< 10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][1]=d;
        d=0;
        System.out.println("Block");
        for(m=0;m<10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][2]=d;
        marks[i][3]=d1;
    }
    private void sem2() throws IOException
    {
        int m,n;
        int d=0,d1=0;
        System.out.println("Unit1");
        for(m=0;m< 10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][4]=d;
        d=0;
        System.out.println("Unit2");
        for(m=0;m<10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][5]=d;
        d=0;
        System.out.println("Block");
        for(m=0;m<10;m++)
        {
            if(m==0)
            System.out.println("Subject1:");
            else if(m==1)
            System.out.println("Subject2:");
            else if(m==2)
            System.out.println("Subject3:");
            else if(m==3)
            System.out.println("Subject4:");
            else if(m==4)
            System.out.println("Subject5:");
            else if(m==5)
            System.out.println("Subject6:");
            else if(m==6)
            System.out.println("Subject7:");
            else if(m==7)
            System.out.println("Subject8:");
            else if(m==8)
            System.out.println("Subject9:");
            else if(m==9)
            System.out.println("Subject10:");
            d=d+Integer.parseInt(br.readLine());
        }
        d1=d1+d;
        marks[i][6]=d;
        marks[i][7]=d1;
        marks[i][8]=marks[i][3]+marks[i][7];
    }
    public void showResult()
    {
        double d=0;
        int j;
        System.out.println("Name  Roll  Unit1  Unit2  Block  Total  Unit1  Unit2  Block  Total  Percentage");
        for(i=0;i< std;i++)
        {
            System.out.print(name[i]+ "    "+roll[i]);
            for(j=0;j< 9;j++)
            {
                System.out.print(marks[i][j]+ "   ");
            }
            d=marks[i][8]/2.0;
            System.out.print(d);
            System.out.println();
        }
    }
    private void sort()
    {
        int j,temp;
        String s;
        for(i=0;i< std-1;i++)
        {
            for(j=i+1;j< std;j++)
            {
                if(marks[i][8]< marks[j][8])
                {
                    s=name[i];
                    name[i]=name[j];
                    name[j]=s;

                    s=roll[i];
                    roll[i]=roll[j];
                    roll[j]=s;
                    temp=marks[i][0];
                    marks[i][0]=marks[j][0];
                    marks[j][0]=temp;
                    temp=marks[i][1];
                    marks[i][1]=marks[j][1];
                    marks[j][1]=temp;
                    temp=marks[i][2];
                    marks[i][2]=marks[j][2];
                    marks[j][2]=temp;
                    temp=marks[i][3];
                    marks[i][3]=marks[j][3];
                    marks[j][3]=temp;
                    temp=marks[i][4];
                    marks[i][4]=marks[j][4];
                    marks[j][4]=temp;
                    temp=marks[i][5];
                    marks[i][5]=marks[j][5];
                    marks[j][5]=temp;
                    temp=marks[i][6];
                    marks[i][6]=marks[j][6];
                    marks[j][6]=temp;
                    temp=marks[i][7];
                    marks[i][7]=marks[j][7];
                    marks[j][7]=temp;
                    temp=marks[i][8];
                    marks[i][8]=marks[j][8];
                    marks[j][8]=temp;
                }
            }
        }
        }
    public void display(String str)
    {
        int j;
        for(i=0;i< std;i++)
        {
            if(roll[i].equalsIgnoreCase(str))
            {
                System.out.print(name[i]+ "    "+roll[i]);
                for(j=0;j< 9;j++)
                System.out.print(marks[i][j]+ "   ");
                break;
            }
        }
        if(i==std)
            System.out.println("Invalid Roll Number.");
    }
    public static void main(String args[])throws IOException
    {
        String ans="y";
        String r;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Report ob=new Report();
        ob.setMarks();
        while(!ans.equalsIgnoreCase("n"))
        {
            System.out.println("\nEnter the Roll Number to display result:");
            r=br.readLine();
            ob.display(r);
            System.out.println("\nAny more student:(y/n):");
            ans=br.readLine();
        }
        ob.showResult();
    }
}