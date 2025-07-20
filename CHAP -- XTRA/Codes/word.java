import java.io.*;

class word
{
    public static void main(String args[]) throws IOException
       {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
        String ty[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
 
        String ten[]={"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
                      "Eighteen","Nineteen"};
 
        String unit[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
 
        System.out.print("Enter a Number : ");
        int n=Integer.parseInt(br.readLine());
         
        
        if(n<1 || n>9999)
            System.out.println("Out of Range");
 
        else
        {
        int th=n/1000; //finding the digit at thousand's place
        int h=(n/100)%10; //finding the digit at hundred's place
        int t=(n/10)%10; //finding the digit at ten's place
        int u=n%10; //finding the digit at unit's place
 
        System.out.print("Output = ");
 
       
        if(th!=0)
        System.out.print(unit[th]+" Thousand");
 
        if(h!=0)
        System.out.print(" "+unit[h]+" Hundred");
 
       
        if((t!=0 || u!=0)&&(th!=0 || h!=0))
        System.out.print(" And");
 
        
        if(t==1) //When digit at ten's place is 1	, we have different words like Ten, Eleven etc.
        System.out.print(" "+ten[u+1]);
 
        else //if it is not 1 then we print the words following a normal pattern
        System.out.print(" "+ty[t]+" "+unit[u]);
        }
    }
}