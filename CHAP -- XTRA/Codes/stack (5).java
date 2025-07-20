package All;

public class stack {

	int s[] = new int [20];
	int sp,n;
	
    public stack(int nn) {
    	for(int i=0;i<20;i++){
    		s[i]=0;
    		sp = -1;
    		n=nn;
    	}
    }
    
    void push(int item){
    	if(sp==(n-1)){
    		System.out.println("Stack Overflow");
    	}
    	else{
    		sp++;
    		s[sp]=item;
    	}
    }
    
    void pop(){
    	int v;
    	if(sp == -1){
    		System.out.println("Stack Underflow");
    	}
    	else{
    		v=s[sp];
    		System.out.println("Popped Elements are:"+v);
    		sp--;
    	}
    }
    
    void display(){
    	if(sp == -1)
    		System.out.println("Stack Empty");
    	else{
    		System.out.println("SP----> |"+s[sp]+"|");
    		System.out.println("-------------");
    		
    		for(int i = sp-1;i>=0;i--){
    			System.out.println("       |"+s[i]+"|");
    			System.out.println("-------------");
    		}
    	}
    		
    }
}