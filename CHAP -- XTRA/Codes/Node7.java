import java.io.*;
class Node7
{
    protected int data,n1;
    protected Node7 link;
    Node7 start;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public Node7()
    {0
    public Node7(int d,Node7 n)
    {
        data=d;
        link=n;
    }
    public void setlink(Node7 n)
    {
        link=n;
    }
    public void setData(int d)
    {
        data=d;
    }
    public Node7 getlink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
    public void linklist()throws IOException
    {
        Node7 temp,last;
        int i,item,value;
        System.out.println("Enter the number of nodes required : ");
        n1=Integer.parseInt(br.readLine());
        start=null;
        System.out.println("Enter the value : ");
        value=Integer.parseInt(br.readLine());
        start=new Node7(value,null);//REFER PARAMETERIZED CONSTRUCTOR
        temp=start;
        for(i=1;i<n1;i++)
        {
            System.out.println("Enter the value : ");
            value=Integer.parseInt(br.readLine());
            last=new Node7(value,null);
            temp.setlink(last);
            temp=last;
        }
    }
    public void showlinklist()throws IOException
    {
        Node7 temp;
        System.out.println("The values in the link list are as follows : ");
        temp=start;
        while(temp.getlink()!=null)
        {
            System.out.print(temp.getData()+"--->");
            temp=temp.getlink();
        }
        System.out.print(temp.getData());
    }
   public void selection_sort (Node7 begn, int n )
{
    int i, j, k, temp ;
    Node7 p, q ;

    p = begn ;
    for ( i = 0 ; i < n - 1 ; i++ )
    {
        q = p.getlink() ;

        for ( j = i + 1 ; j < n ; j++ )
        {
            if ( p.getData() > q.getData() )
            {
                temp = p.getData() ;
                p.setData(q.getData());
                q.setData(temp) ;
            }
            q = q.getlink();
        }
        p = p.getlink();
    }
}
public void main(String args[])throws IOException
{
linklist();
showlinklist();
selection_sort(start,n1);
showlinklist();
    }
}