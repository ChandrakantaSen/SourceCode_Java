import java.io.*;
class treenode
{
protected treenode left, right;
protected int data;
public treenode()
{
data=0;
left=right=null;
    }
public treenode(int n)
{
data=n;
left=right=null;
    }
    public void display()
    {
        System.out.print(data+" ");
    }
    public void setleft(treenode n)
    {
        left=n;
    }
    public void setright(treenode n)
    {
        right=n;
    }
    public treenode getleft()
    {
       return left;
    }
    public treenode getright()
    {
        return right;
    }
    
    public void setdata(int d)
    {
        data=d;
    }
    public int getdata()
    {
        return data;
    }
}

class binarytree
{
treenode root;
public binarytree()
{
root=null;
    }
    public void insert(int data)
    {
        root=insert(root, data);
    }
    public boolean isEmpty()
    {
        return root==null;
    }
     private treenode insert(treenode node,int data)
     {
         if(node==null)
         node=new treenode(data);
         else
         {
             if(data<=node.data)
             node.left=insert(node.left,data);
             else
             node.right=insert(node.right,data);
            }
            return(node);
        }
         public void delete(int key)
         {
             if(isEmpty())
             System.out.println("Tree empty.");
             else if(search(key)==false)
             System.out.println(key+" is absent.");
             else
             {
                 root=delete(root,key);
                 System.out.println(key+ "is deleted.");
                }
            }
            private treenode delete(treenode root,int key)
            {
                treenode p, p2,n;
                treenode lt;
                treenode rt=new treenode(0,null);
                if(root.getdata()==key)
                {
                    
                    lt=root.getleft();
                    rt=root.getright();
                    if(lt==null &&rt==null)
                    return null;
                    else if(lt==null)
                    {
                    p=rt;
                    return p;
                }
                else if(rt==null)
               { p=lt;
             return p;
            }
        }
            else
            {
                p2=rt;
                p=rt;
                while(p.getleft()!=null)
                p=p.getleft();
                p.setleft(lt);
                return p2;
            }
        
        if(key<root.getdata())
        {
            n=delete(root.getleft(),key);
            root.setleft(n);
        }
        else
        {
            n=delete(root.getright(),key);
            root.setright(n);
        }
        return root;
    }
    public int countnodes()
    {
        return countnodes(root);
    }
     private int countnodes(treenode r)
     {
         if(r==null)
         {
             return 0;
            }
            else
            {
                int l=1;
                l+=countnodes(r.getleft());
                l+=countnodes(r.getright());
                return l;
            }
        }
        public boolean search(int value)
        {
            return search(root, value);
        }
        private boolean search(treenode r, int val)
        {
            boolean  found=false;
            while((r!=null) && !found)
            {
                int rval=r.getdata();
                if(val<rval)
                r=r.getleft();
                else if(val>rval)
                r=r.getright();
                else
                {
                    found=true;
                    break;
                }
                return found;
            }
        }
            public void inorder()
            {
                inorder(root);
            }
             private void inorder(treenode r)
             {
                 if(r!=null)
                 {
                     inorder(r.getleft());
                     System.out.print(r.getdata()+" ");
                     inorder(r.getright());
                    }
                }
                public void preorder()
                {
                    preorder(root);
                }
                 private void preorder(treenode r)
                 {
                     if(r!=null)
                     {
                         System.out.print(r.getdata()+" ");
                         preorder(r.getleft());
                         preorder(r.getright());
                        }
                    }
                    public void postorder()
                    {
                        postorder(root);
                    }
                    private void postorder(treenode r)
                    {
                        if(r!=null)
                        {
                            postorder(r.getleft());
                         postorder(r.getright());
                          System.out.print(r.getdata()+" ");
                        }
                    }
                }
                
             class test
             {
                 static binarytree bt;
                 public static void main(String args[])throws IOException
                 {
                     bt=new binarytree();
                      BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
                      int val;
                      char ch;
                      do
                      {
                          System.out.println("enter a number:");
                          val=Integer.parseInt(br.readLine());
                          bt.insert(val);
                          System.out.println("Do you want to insert further? enter 'y' or 'n':");
                          ch=(char)br.read();
                          String clearbuffer=br.readLine();
                        }while(ch=='y'||ch=='Y');
                        System.out.println("Postorder traversal:");
                        bt.postorder();
                        System.out.println("Preorder traversal:");
                        bt.preorder();
                        System.out.println("Inorder traversal:");
                        bt.inorder();
                        int l=bt.countnodes();
                        System.out.println("No. of nodes:"+l);
                        System.out.println("Enter the item to be deleted : ");
                        val=Integer.parseInt(br.readLine());
                        bt.delete(val);
                        System.out.println("Inorder traversal after deleteion:");
                        bt.inorder();
                        System.out.println();
                    }
                }
                        
                          