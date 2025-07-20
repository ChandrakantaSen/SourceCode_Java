import java.io.*;
class Node5
{
protected int data;
protected Node5 link;
Node5 start;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public Node5()
{
link=null;
data=0;
}
public Node5(int d,Node5 n)
{
data=d;
link=n;
}
public void setlink(Node5 n)
{
link=n;
}
public void setData(int d)
{
data=d;
}
public Node5 getlink()
{
return link;
}
public int getData()
{
return data;
}
public void linklist()throws IOException
{
Node5 temp,last;
int n1,i,item,value;
System.out.println("Enter the number of nodes required : ");
n1=Integer.parseInt(br.readLine());
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
start=new Node5(value,null);
temp=start;
for(i=1;i<n1;i++)
{
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
last=new Node5(value,null);
temp.setlink(last);
temp=last;
}
item=0;
System.out.println("Enter which node is to be deleted : - ");
value=Integer.parseInt(br.readLine());
start=delete_between(start,item,value);
} 
public void showlinklist()throws IOException
{
Node5 temp;
System.out.println("The values in the link list are as follows : ");
temp=start;
while(temp.getlink()!=null)
{
System.out.print(temp.getData()+"--->");
temp=temp.getlink();
}
System.out.print(temp.getData());
}
public Node5 delete_between(Node5 start,int item,int value)
{
Node5 temp,ntemp,prev;
temp=new Node5(0,null);
prev=temp;
temp.setlink(start);
if(start==null)
{
System.out.println("\n\t UNDERFLOW ");
    }
else
{
while(temp!=null)
{
if(temp.getData()==value)
{
prev.setlink(temp.getlink());
temp.setlink(null);
break;
    }
    prev=temp;
    temp=temp.getlink();
    }
    }
 return start;   
    }
}