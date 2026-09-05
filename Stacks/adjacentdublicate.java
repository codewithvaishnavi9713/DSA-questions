package Stacks;
import java.util.Stack;
public class adjacentdublicate {
    public static void main(String[] args){
        String s="abbaca";
        Stack<Character> Stack=new Stack<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( Stack.contains(ch) ){

            }
            
            
            else{
                Stack.push(ch);
                    
                
            }
    }
    System.out.println(Stack);
}
}