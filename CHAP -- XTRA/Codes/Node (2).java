import java.io.*;
class Node
{
    protected int data;
    protected Node link;
    Node start;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public Node()
    {
        link=null;
        data=0;
    }
    public Node(int d,Node n)
    {
        data=d;
        link=n;
    }
    public void setlink(Node n)
    {
        link=n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public Node getlink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
    public void linklist()throws IOException
    {
        Node temp,last;
        int i,n1,item,value;
        System.out.println("Enter the number of nodes required : ");
        n1=Integer.parseInt(br.readLine());
        start=null;
        System.out.println("Enter the value : ");
        value=Integer.parseInt(br.readLine());
        start=new Node(value,null); //REFER PARAMETERIZED CONSTRUCTOR
        temp=start;
        for(i=1;i<n1;i++)
        {
            System.out.println("Enter the value : ");
            value=Integer.parseInt(br.readLine());
            last=new Node(value,null);
            temp.setlink(last);
            temp=last;
        }
    }
    public void showlinklist()throws IOException
    {
        Node temp;
        System.out.println("The values in the link list are as follows : ");
        temp=start;
        while(temp!=null)
        {
            System.out.print(temp.getData()+"--->");
            temp=temp.getlink();
        }
    }
}