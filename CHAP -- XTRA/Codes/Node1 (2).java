import java.io.*;
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
    System.out.println("Enter the number of nodes required : - ");
    n1=Integer.parseInt(br.readLine());
    start=null;
    System.out.println("Enter the value : - ");
    value=Integer.parseInt(br.readLine());
    start=new Node1(value,null);
    temp=start;
    for(i=1;i<n1;i++)    
    {
        System.out.println("Enter the value : - ");
    value=Integer.parseInt(br.readLine());
    last=new Node1(value,null);
    temp.setlink(last);
    temp=last;
    }
    System.out.println("Enter the value inserted at the first position of the linkedlist : - ");
    item=Integer.parseInt(br.readLine());
    start=insbegin(start,item);
}
public void showlinklist()throws IOException
    {
        Node1 temp;
System.out.println("The values in the linked list are as follows :  -  ");
temp=start;
while(temp.getlink()!=null)
{
System.out.print(temp.getData()+"--> ");
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
}