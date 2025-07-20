 

class Position
{
    int row, col;
    
    public Position(int r, int c)
    {
        row = r;
        col = c;
    }
    
    public Position north()
    {
        int r = this.row-1;
        int c = this.col;
        return new Position(r, c);
    }
    
    public Position south()
    {
        int r = this.row+1;
        int c = this.col;
        return new Position(r, c);
    }
    
    public Position east()
    {
        int r = this.row;
        int c = this.col+1;
        return new Position(r, c);
    }
    
    public Position west()
    {
        int r = this.row;
        int c = this.col-1;
        return new Position(r, c);
    }
    
    public boolean equals(Position other)
    {
        if ((this.row == other.row) && (this.col == other.col))
        	return true;
        else
        	return false;
    }
}