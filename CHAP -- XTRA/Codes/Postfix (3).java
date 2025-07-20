package All;

public class Postfix {
Stack stack = new Stack(1000);
char []operators = {'(','*','%','/','+','-',')'}; 
char[] infixExpression;
public Postfix(String infixExpression){
    this.infixExpression = infixExpression.toCharArray();
}

int priority(char operator){
    int result = 0;
    switch(operator){
    case '(':
        result = 1;
        break;
    case '*':
        result = 2;
        break;
    case '%':
        result = 3;
        break;
    case '/':
        result = 4;
        break;
    case '+':
        result = 5;
        break;
    case '-':
        result = 5;
        break;
    case ')':
        result = 7;
    }
    return result;
}

public String convertToPostfix(){
    int priority;
    String lastData;
    String exp = "";
    for(int i = 0;i<this.infixExpression.length;i++){
        priority = priority(this.infixExpression[i]);
        if(priority == 0){
            exp += this.infixExpression[i];
        }
        else if(priority == 1){
            try {
                stack.push(String.valueOf(this.infixExpression[i]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(priority == 7){
            while(stack.top != 0){
                try {
                    lastData = stack.pop();
                    if(!lastData.equals("(")){
                        exp += lastData;
                    }
                    else{
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else{
            try { 
                if(stack.top != 0){
                    while(true){
                        lastData = stack.pop();
                        stack.push(lastData);
                        if(stack.top == 0 || lastData.equals("(") || priority(lastData.toCharArray()[0]) > priority){
                            stack.push(String.valueOf(this.infixExpression[i]));
                            break;
                        }
                        exp += stack.pop();
                    }
                }else{
                    stack.push(String.valueOf(this.infixExpression[i]));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    if(stack.top != 0){
        try {
            while(stack.top != 0){
                exp += stack.pop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return exp;
}
}