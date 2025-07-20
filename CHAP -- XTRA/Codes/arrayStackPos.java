package Maze;

public class arrayStackPos
{
    protected Position Stack[];
    protected int ctr;
    
    public arrayStackPos(int capacity)
    {
        Stack = new Position[capacity];
        ctr = -1;
    }
    
    public boolean isEmpty()
    {
        return ctr == -1;
    }
    
    public void add(Position i)
    {
        if(ctr+1 < Stack.length)
        	Stack[++ctr] = i;
    }
    
    public Position remove()
    {
        if (isEmpty())
        	return new Position(-1, -1);
        return Stack[ctr--];
    }
    
    public Position top()
    {
        if (isEmpty())
        	return new Position(-1, -1);
        return Stack[ctr--];
    }
}