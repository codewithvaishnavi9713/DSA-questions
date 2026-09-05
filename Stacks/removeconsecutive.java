package Stacks;
import java.util.Stack;
public class removeconsecutive {
    public static void main(String[] args){
        Stack<Character> Stack=new Stack<>();
        String s="abbaca";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Stack.isEmpty() && Stack.peek()==ch){
                Stack.pop();
            }
            else{
                Stack.push(ch);
                    
                
            }


    }
    System.out.println(Stack);
}
}