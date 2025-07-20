 import java.io.*;                                                                             import java.io.*;
class Node1
{
    protected int data;
    protected Node1 link;
    Node1 start;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
    public void linklist()throws IOException
    {
        Node1 temp,last;
        int i,n1,item,value;
        System.out.println("Enter the number of nodes required : ");
        n1=Integer.parseInt(br.readLine());
        start=null;
        System.out.println("Enter the value : ");
        value=Integer.parseInt(br.readLine());
        start=new Node1(value,null);
        temp=start;
        for(i=1;i<n1;i++)
        {
            System.out.println("Enter the value : ");
            value=Integer.parseInt(br.readLine());
            last=new Node1(value,null);
            temp.setlink(last);
            temp=last;
        }
        System.out.println("Enter the value to be inserted at the first position of the linkedlist : - ");
        item=Integer.parseInt(br.readLine());
        start=insbegin(start,item);
        System.out.println("Enter the value to be inserted at the last position of the linkedlist : - ");
        item=Integer.parseInt(br.readLine());
        start=insend(start,item);
        System.out.println("Enter the value to be inserted in between : - ");
        item=Integer.parseInt(br.readLine());
        System.out.println("Enter the node after which to be inserted : - ");
        value=Integer.parseInt(br.readLine());
        start=insbet(start,item,value);
    }
    public void showlinklist()throws IOException
    {
        Node1 temp;
        System.out.println("The values in the link list are as follows : ");
        temp=start;
        while(temp.getlink()!=null)
        {
            System.out.print(temp.getData()+"--->");
            temp=temp.getlink();
        }
        System.out.print(temp.getData());
    }
    public Node1 insbegin(Node1 start,int item)
    {
        Node1 temp;
        temp=new Node1(item,null);
        temp.setlink(start);
        start=temp;
        return start;
    }
    public Node1 insend(Node1 start,int item)
    {
        Node1 prev;
        Node1 temp=new Node1(item,null);
        prev=start;
        while(prev.getlink()!=null)
        {
            prev=prev.getlink();
        }
        prev.setlink(temp);
        return start;
    }
    public Node1 insbet(Node1 start,int item,int value)
    {
        Node1 temp,ntemp;
        temp=new Node1(item,null);
        ntemp=start;
        while(ntemp!=null)
        {
            if(ntemp.getData()==value)
            {
                temp.setlink(ntemp.getlink());
                ntemp.setlink(temp);
                break;
            }
            ntemp=ntemp.getlink();
        }
        return start;
    }
}