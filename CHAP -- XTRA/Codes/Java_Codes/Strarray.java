import java.util.*;
class Strarray
{
    char str[];
    int size;
    Strarray()
    {
        size=0;
    }
    Strarray(char c[])
    {
        str=c;
        size=c.length;
    }
    void displayarray()
    {
        for(int i=0;i<size;i++)
        System.out.print(str[i]+" ");
    }
    void move()
    {
        int i=0,j=size-1;
        while(i<size)
        {
            if(Character.isUpperCase(str[i]))
            {
                char temp=str[j];
                str[j]=str[i];
                str[i]=temp;
                j--;
            }
            else if(i==j)
            break;
            else
            i++;
        }
    }
}