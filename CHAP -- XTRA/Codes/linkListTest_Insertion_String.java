import java.io.*;
class Node_String
{
    protected String data;
    protected Node_String link;
    public Node_String()
    {
        link=null;
        data="";
    }
    public Node_String(String d,Node_String n)
    {
        data=d;
        link=n;
    }
    public void setlink(Node_String n)
    {
        link=n;
    }
    public void setData(String d)
    {
        data=d;
    }
    public Node_String getlink()
    {
        return link;
    }
    public String getData()
    {
        return data;
    }
}
class linkedList_String
{
int flag;
        protected Node_String start;
        public linkedList_String()
        {
            start=null;
            flag=0;
        }
        public void Insert(String val)
        {
            Node_String nptr,ptr,save=null;
            nptr=new Node_String(val,null);
            boolean ins=false;
            if(start==null)
            {
            start=nptr;
                  }
             else
        {                           
            start.setlink(nptr);
          nptr=start;
        }

        System.out.print(start.getData()+"-->");
        ptr=start.getlink();
        while(ptr.getlink()!=null)
        {
            System.out.print(ptr.getData()+"-->");
            ptr=ptr.getlink();
        }
        System.out.print(ptr.getData()+"!!!!");
        System.out.println();
    }
}
class linkListTest_Insertion_String
{
    protected static linkedList_String S;
    public static void main(String[]args)throws IOException
    {
        String num;
        S=new linkedList_String();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("....Starting List Test for INSERTION....\n");
        for(int a=0;a<5;a++)
        {
            System.out.print("Enter a word : ");
            
                    num=br.readLine();
                    S.Insert(num);
                    System.out.println("Inserted : "+num);
                
            }
            System.out.println("\nCreated List is : ");
            System.out.println("\n----List Test Over----");
        }
    }
                
               