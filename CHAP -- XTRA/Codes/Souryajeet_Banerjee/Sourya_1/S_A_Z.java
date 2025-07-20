import java.io.*;
class S_A_Z
{
    public static void main(String args[])throws IOException
    {
        String  s1="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s1=br.readLine();
        int l1=s1.length();
        s1=s1.toLowerCase();
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
        for(int i1=0;i1<l1;i1++)
        {
            char ch=s1.charAt(i1);
            if(ch=='a')
            {
              a=a+1; 
            }
            if(ch=='b')
            {
              b=b+1;  
            }
            if(ch=='c')
            {
                c=c+1;
            }
            if(ch=='d')
            {
                d=d+1;
            }
            if(ch=='e')
            {
                e=e+1;
            }
            if(ch=='f')
            {
                f=f+1;
            }
            if(ch=='g')
            {
               g=g+1; 
            }
            if(ch=='h')
            {
                h=h+1;
            }
            if(ch=='i')
            {
                i=i+1;
            }
            if(ch=='j')
            {
                j=j+1;
            }
            if(ch=='k')
            {
                k=k+1;
            }
            if(ch=='l')
            {
                l=l+1;
            }
            if(ch=='m')
            {
                m=m+1;
            }
            if(ch=='n')
            {
                n=n+1;
            }
            if(ch=='o')
            {
                o=o+1;
            }
            if(ch=='p')
            {
                p=p+1;
            }
            if(ch=='q')
            {
                q=q+1;
            }
            if(ch=='r')
            {
                r=r+1;
            }
            if(ch=='s')
            {
                s=s+1;
            }
            if(ch=='t')
            {
                t=t+1;
            }
            if(ch=='u')
            {
                u=u+1;
            }
            if(ch=='v')
            {
                v=v+1;
            }
            if(ch=='w')
            {
                w=w+1;
            }
            if(ch=='x')
            {
                x=x+1;
            }
            if(ch=='y')
            {
                y=y+1;
            }
            if(ch=='z')
            {
                z=z+1;
            }
        }
        if(a>0)
        {
            System.out.println("a is present "+a+" times.");
        }
        if(b>0)
        {
            System.out.println("b is present "+b+" times.");
        }
        if(c>0)
        {
            System.out.println("c is present "+c+" times.");
        }
        if(d>0)
        {
            System.out.println("d is present "+d+" times.");
        }
        if(e>0)
        {
            System.out.println("e is present "+e+" times.");
        }
        if(f>0)
        {
            System.out.println("f is present "+f+" times.");
        }
        if(g>0)
        {
            System.out.println("g is present "+g+" times.");
        }
        if(h>0)
        {
            System.out.println("h is present "+h+" times.");
        }
        if(i>0)
        {
            System.out.println("i is present "+i+" times.");
        }
        if(j>0)
        {
            System.out.println("j is present "+j+" times.");
        }
        if(k>0)
        {
            System.out.println("k is present "+k+" times.");
        }
        if(l>0)
        {
            System.out.println("l is present "+l+" times.");
        }
        if(m>0)
        {
            System.out.println("m is present "+m+" times.");
        }
        if(n>0)
        {
            System.out.println("n is present "+n+" times.");
        }
        if(o>0)
        {
            System.out.println("o is present "+o+" times.");
        }
        if(p>0)
        {
            System.out.println("p is present "+p+" times.");
        }
        if(q>0)
        {
            System.out.println("q is present "+q+" times.");
        }
        if(r>0)
        {
            System.out.println("r is present "+r+" times.");
        }
        if(s>0)
        {
            System.out.println("s is present "+s+" times.");
        }
        if(t>0)
        {
            System.out.println("t is present "+t+" times.");
        }
        if(u>0)
        {
            System.out.println("u is present "+u+" times.");
        }
        if(v>0)
        {
            System.out.println("v is present "+v+" times.");
        }
        if(w>0)
        {
            System.out.println("w is present "+w+" times.");
        }
        if(x>0)
        {
            System.out.println("x is present "+x+" times.");
        }
        if(y>0)
        {
            System.out.println("y is present "+y+" times.");
        }
        if(z>0)
        {
            System.out.println("z is present "+z+" times.");
        }
    }
}