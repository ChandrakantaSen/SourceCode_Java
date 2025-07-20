class linkedList_String
{
        protected Node_String start;
        public linkedList_String()
        {
            start=null;
        }
        public boolean isEmpty()
        {
            return start==null;
        }
        public void Insert(String val)
        {
            Node_String nptr,ptr,save=null;
            nptr=new Node_String(val,null);
            boolean ins=false;
            if(start==null)
            start=nptr;
            else if(val.length()<=start.getData().length())
            {
                nptr.setlink(start);
                start=nptr;
        }
        else
        {
            save=start;
            ptr=start.getlink();
            while(ptr!=null)
            {
                if(val.length()>=save.getData().length() && val.length()<=ptr.getData().length())
                {
                    save.setlink(nptr);
                    nptr.setlink(ptr);
                    ins=true;
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getlink();
                }
            }
            if(ins==false)
            {
                save.setlink(nptr);
            }
        }
    }
    public void display()
    {
        Node_String ptr=start;
        System.out.print(start.getData()+"-->");
        ptr=start.getlink();
        while(ptr.getlink()!=null)
        {
            System.out.print(ptr.getData()+"-->");
            ptr=ptr.getlink();
        }
        System.out.print(ptr.getData());
        System.out.println();
    }
}