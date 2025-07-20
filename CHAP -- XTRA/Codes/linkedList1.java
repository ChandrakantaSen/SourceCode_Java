import java.io.*;
class Node1
{
    protected int data;
    protected Node1 link;
    public Node1()
    {
        link=null;
        data=0;
    }
    public Node1(int d,Node1 n)
    {
        data=d;
        link=n;
    }
    public void setlink(Node1 n)
    {
        link=n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public Node1 getlink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}
class linkedList1
{
    protected Node1 start;
    public linkedList1()
    {
        start=null;
    }
    public boolean isEmpty()
    {
        return start==null;
    }
    public void Insert(int val)
    {
        
            Node1 nptr,ptr,save=null;
            nptr=new Node1(val,null);
            boolean ins=false;
            if(start==null)
            start=nptr;
            else if(val<=start.getData())
            {
                nptr.setlink(start);
                start=nptr;
        }
        else
        {
            save=start;
            ptr=start.getlink();
            while(ptr!=null)
            {
                if(val>=save.getData() && val<=ptr.getData())
                {
                    save.setlink(nptr);
                    nptr.setlink(ptr);
                    ins=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getlink();
                }
            }
            if(ins==false)
            {
                save.setlink(nptr);
            }
        }
    }
    public boolean Delete(int val)
    {
        Boolean res=false;
        if(start.getData()==val)
        {
            start=start.getlink();
            res=true;
        }
        else
        {
            Node1 ptr,save;
            save=start;
            ptr=start.getlink();
            while(ptr!=null)
            {
                if(ptr.getData()==val)
                {
                    Node1 next=ptr.getlink();
                    save.setlink(next);
                    res=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getlink();
                }
            }
        }
        return res;
    }
    public void display()
    {
        Node1 ptr=start;
        System.out.print(start.getData()+"-->");
        ptr=start.getlink();
        while(ptr.getlink()!=null)
        {
            System.out.print(ptr.getData()+"-->");
            ptr=ptr.getlink();
        }
        System.out.print(ptr.getData()+"!!!!");
        System.out.println();
    }
}

class linklistTest_Deletion
{
    protected static linkedList1 S;
    public static void main(String[]args)throws IOException
    {
        int num;
        S=new linkedList1();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("......Starting List Test for DELETION......\n");
        for(int a=0;a<5;++a)
        {
            System.out.print("Enter a number : ");
            num=Integer.parseInt(br.readLine());
                S.Insert(num);

            }
        System.out.print("Enter number to be deleted : ");
        num=Integer.parseInt(br.readLine());
            boolean res=S.Delete(num);
            if(res==true)
            System.out.println(num+"deleted successfully..");
            else
            System.out.println("Sorry!!No such number found in the list..");

        System.out.println("\nNow the List is : ");
        S.display();
        System.out.println("\n----List Test Over----");
    }
}