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