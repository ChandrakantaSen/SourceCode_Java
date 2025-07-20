import java.io.*;
class Node_switch
{
int data;
Node_switch link;
Node_switch start;
int ch,item,value;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public Node_switch()
{
link=null;
data=0;
}
public Node_switch(int d,Node_switch n)
{
data=d;
link=n;
}
public void setlink(Node_switch n)
{
link=n;
}
public void setData(int d)
{
data=d;
}
public Node_switch getlink()
{
return link;
}
public int getData()
{
return data;
}
public void main(String args[])throws IOException
{
do
{
System.out.println("1.simple link list\n2.insertion-beginning\n3.insertion-ending\n4.insertion-between\n5.display\n6.exit");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1 :
linklist();
break;
case 2 :
begin();
break;
case 3 :
end();
break;
case 4 :
between();
break;
case 5 :
showlinklist();
break;
case 6 : 
System.out.println("The End");
System.exit(0);
default : 
System.out.println("Wrong Choice");
}
System.out.println("want to continue");
}
while(ch>0);
}
public void linklist()throws IOException
{
Node_switch temp,last;
int i,n1,item,value;
System.out.println("Enter the number of nodes required : ");
n1=Integer.parseInt(br.readLine());
start=null;
System.out.println("Enter the value : ");
value=Integer.parseInt(br.readLine());
start=new Node_switch(value,null);
temp=start;
for(i=1;i<n1;i++)
{
System.out.println("Enter the value : ");
value=Integer.parseInt(br.readLine());
last=new Node_switch(value,null);
temp.setlink(last);
temp=last;
}
}
public void showlinklist()throws IOException
{
Node_switch temp;
System.out.println("The values in the link list are as follows : ");
temp=start;
while(temp.getlink()!=null)
{
System.out.print(temp.getData()+"--->");
temp=temp.getlink();
}
System.out.print(temp.getData());
}
public void begin()throws IOException
{
System.out.println("Enter the value to be inserted at the first position of the linkedlist : - ");
item=Integer.parseInt(br.readLine());
start=insbegin(start,item);
}
public Node_switch insbegin(Node_switch start,int item)
{
Node_switch temp;
temp=new Node_switch(item,null);
temp.setlink(start);
start=temp;
return start;
}
public void end()throws IOException
{
System.out.println("Enter the value to be inserted at the last position of the linkedlist : - ");
item=Integer.parseInt(br.readLine());
start=insend(start,item);
}
public Node_switch insend(Node_switch start,int item)
{
Node_switch prev,sec;
Node_switch temp=new Node_switch(item,null);
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
public void between()throws IOException
{
System.out.println("Enter the value to be inserted in between : - ");
item=Integer.parseInt(br.readLine());
System.out.println("Enter the node after which to be inserted : - ");
value=Integer.parseInt(br.readLine());
start=insbet(start,item,value);
}
public Node_switch insbet(Node_switch start,int item,int value)
{
Node_switch temp,ntemp;
temp=new Node_switch(item,null);
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