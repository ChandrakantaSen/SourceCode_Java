import java.io.*;
class Node2
{
    protected int data;
    protected Node2 link;
    Node2 start;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public Node2()
    {
        link=null;
        data=0;
    }
    public Node2(int d,Node2 n)
    {
        data=d;
        link=n;
    }
    public void setlink(Node2 n)
    {
        link=n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public Node2 getlink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
    public void linklist()throws IOException
    {
        Node2 temp,last;
        int i,n1,item,value;
        System.out.println("Enter the number of nodes required : ");
        n1=Integer.parseInt(br.readLine());
        start=null;
        System.out.println("Enter the value : ");
        value=Integer.parseInt(br.readLine());
        start=new Node2(value,null);
        temp=start;
        for(i=1;i<n1;i++)
        {
            System.out.println("Enter the value : ");
            value=Integer.parseInt(br.readLine());
            last=new Node2(value,null);
            temp.setlink(last);
            temp=last;
        }
        System.out.println("Enter the value to be inserted at the last position of the linkedlist : - ");
        item=Integer.parseInt(br.readLine());
        start=insend(start,item);
    }
    public void showlinklist()throws IOException
    {
        Node2 temp;
        System.out.println("The values in the link list are as follows : ");
        temp=start;
        while(temp.getlink()!=null)
        {
            System.out.print(temp.getData()+"--->");
            temp=temp.getlink();
        }
        System.out.print(temp.getData());
    }
    public Node2 insend(Node2 start,int item)
    {
        Node2 prev,sec;
        Node2 temp=new Node2(item,null);
        prev=start;
        sec=start.getlink();
        while(sec!=null)
        {
            prev=sec;
            sec=sec.getlink();
        }
        prev.setlink(temp);
        return start;
    }
}