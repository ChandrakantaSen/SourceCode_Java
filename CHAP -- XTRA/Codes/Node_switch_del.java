import java.io.*;
class Node_switch_del
{
int data;
Node_switch_del link;
Node_switch_del start;
Node_switch_del temp;
int ch,item,value;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public Node_switch_del()
{
link=null;
data=0;
}
public Node_switch_del(int d,Node_switch_del n)
{
data=d;
link=n;
}
public void setlink(Node_switch_del n)
{
link=n;
}
public void setData(int d)
{
data=d;
}
public Node_switch_del getlink()
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
System.out.println("1.simple link list\n2.deletion-beginning\n3.deletion-ending\n4.deletion-between\n5.display\n6.exit");
System.out.println("Enter your choice : - ");
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
while(true);
}
public void linklist()throws IOException
{
Node_switch_del temp,last;
int n1,i,item,value;
System.out.println("Enter the number of nodes required : ");
n1=Integer.parseInt(br.readLine());
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
start=new Node_switch_del(value,null);
temp=start;
for(i=1;i<n1;i++)
{
System.out.println("Enter a value : ");
value=Integer.parseInt(br.readLine());
last=new Node_switch_del(value,null);
temp.setlink(last);
temp=last;
}
}
public void begin()throws IOException
{
item=0;
if(item!=-10)
{
System.out.println(start.getData()+" is deleted since it is in the starting point ");
}
start=delete_start(start,item);
}
public void end()throws IOException
{
item=0;
/*if(item!=-10)
{
System.out.println(temp.getData()+" is deleted since it is in the ending point ");
}*/
start=delete_end(start,item);
}
public void between()throws IOException
{
item=0;
/*if(item!=-10)
{
System.out.println(temp.getData()+" is deleted since it is in between ");
}*/
start=delete_between(start,item,value);
}
public void showlinklist()throws IOException
{
Node_switch_del temp;
System.out.println("The values in the link list are as follows : ");
temp=start;
while(temp.getlink()!=null)
{
System.out.print(temp.getData()+"--->");
temp=temp.getlink();
}
System.out.print(temp.getData());
}
public Node_switch_del delete_end(Node_switch_del start,int i)
{
Node_switch_del temp,ntemp,prev;
temp=start;
prev=new Node_switch_del(0,null);
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
public Node_switch_del delete_start(Node_switch_del start,int item)
{
Node_switch_del temp;
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
public Node_switch_del delete_between(Node_switch_del start,int item,int value)
{
Node_switch_del temp,ntemp,prev;
temp=new Node_switch_del(0,null);
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