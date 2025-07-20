import java.io.*;
class Node
{
    Node start;
    int data;
    Node link;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Node()
    {
        data=0;
        link=null;
    }
    Node(int d,Node n)
    {
        data=d;
        link=n;
    }
    void setdata(int d)
    {
        data=d;
    }
    void setlink(Node n)
    {
        link=n;
    }
    int getdata()
    {
        return data;
    }
    Node getlink()
    {
        return link;
    }
    void link_list()throws IOException
    {
        int n,i,value;
        Node last,temp;
        System.out.println("Enter the number of nodes required : ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the values : ");
        value=Integer.parseInt(br.readLine());
        start=null;
        start=new Node(value,null);
        temp=start;
        for(i=1;i<n;i++)
        {
            value=Integer.parseInt(br.readLine());
            last=new Node(value,null);
            temp.setlink(last);
            temp=last;
        }
    }
    void showList()throws IOException
    {
        Node temp;
        System.out.println("The values in the link list are : ");
        temp=start;
        while(temp.getlink()!=null)
        {
            System.out.print(temp.getdata()+"---->");
            temp=temp.getlink();
        }
        System.out.print(temp.getdata());
    }
    Node insbegin(Node start,int item)
    {
        Node temp;
        temp=new Node(item,null);
        temp.setlink(start);
        start=temp;
        return start;
    }
    void begin()throws IOException
    {
         System.out.println("Enter the data to be added in 1st position: ");
                int item =Integer.parseInt(br.readLine());
                start=insbegin(start,item);
            }
    void main()throws IOException
    {
        int ch,i,t=1;
        Node ob=new Node();
        while(t==1)
        {
            System.out.println("\n\n\t\t\t\tMENU\n\n");
            System.out.println("\t\t\t1)Create Link list");
            System.out.println("\t\t\t2)Add in 1st position ");
            System.out.println("\t\t\t3)Add at last ");
            System.out.println("\t\t\t4)Add in between ");
            System.out.println("\t\t\t5)Display");
            System.out.println("\t\t\t6)End ");
            System.out.println("Enter your choice : ");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                ob.link_list();
                break;
                case 2:
                ob.begin();
                break;                
                case 5:
                ob.showList();
                break;
            }
            System.out.println("\nWant to continue : Press 1 else 0 ");
            t=Integer.parseInt(br.readLine());
        }
        
            
        } 
}
            
        
    
