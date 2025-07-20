class arrange_Digits{
    public static void main(int n){
        int i,j,p,r;
        System.out.println("Enter the digit: ");
        
        for(i=0;i<=10;i++){
            p=n;
            while(p!=0){
                r=p%10;
                if(r==i){
                    System.out.print(r+",");
                }
                p=p/10;
            }
        }
        System.out.println();
    }
}