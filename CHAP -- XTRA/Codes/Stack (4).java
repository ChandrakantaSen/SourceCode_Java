public class Stack {

int top = 0;
int stackSize = 0;
String[] stack;

public Stack(int stackSize){
    this.stackSize = stackSize;
    stack = new String[stackSize];
}

public int getTop(){
    return top;
}

public void push(String arg)throws Exception{
    if(top == stackSize){
        throw new Exception("Stack is full!");
    }
    else{
        this.stack[top++] = arg;
    }
}

public String pop()throws Exception{
    if(top == 0){
        throw new Exception("Stack is empty");
    }
    else{
        return this.stack[--top];
    }
}

public int stackCount(){
    return top++;
}
}