import java.io.*;
class Node4
{
protected int data;
protected Node4 link;
Node4 start;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public Node4()
{
link=null;
data=0;
}
public Node4(int d,Node4 n)
{
data=d;
link=n;
}
public void setlink(Node4 n)
{
link=n;
}
public void setData(int d)
{
data=d;
}
public Node4 getlink()
{
return link;
}
public int getData()
{
return data;
}
public void linklist()throws IOException
{
Node4 temp,last;
int n1,i,item,value;
System.out.println("Enter the number of nodes required : ");
n1=Integer.parseInt(br.readLine());
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
start=new Node4(value,null);
temp=start;
for(i=1;i<n1;i++)
{
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
last=new Node4(value,null);
temp.setlink(last);
temp=last;
}
item=0;
if(item!=-10)
{
System.out.println(start.getData()+" is deleted since it is in the starting point ");
}
start=delete_start(start,item);
start=delete_end(start,item);
if(item!=-10)
{
System.out.println(temp.getData()+" is deleted since it is in the ending point ");
}
} 
public void showlinklist()throws IOException
{
Node4 temp;
System.out.println("The values in the link list are as follows : ");
temp=start;
while(temp.getlink()!=null)
{
System.out.print(temp.getData()+"--->");
temp=temp.getlink();
}
System.out.print(temp.getData());
}
public Node4 delete_end(Node4 start,int i)
{
Node4 temp,ntemp,prev;
temp=start;
prev=new Node4(0,null);
if(start==null)
{
System.out.println(" UNDERFLOW ");
i=-10;
}
else
{
while(temp.getlink()!=null)
{
prev=temp;
temp=temp.getlink();
}
prev.setlink(null);
i=temp.getData();
}
return start;
}
public Node4 delete_start(Node4 start,int item)
{
Node4 temp;
temp=start;
if(start==null)
{
System.out.println(" UNDERFLOW ");
item=-10;
}
else
{
item=temp.getData();
start=start.getlink();
temp.setlink(null);
}
return start;
}
}