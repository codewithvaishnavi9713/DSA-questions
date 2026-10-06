package Stacks;

import java.util.ArrayList;
import java.util.Stack;
public class nextgreaterelement {
    public ArrayList<Integer>nextGreaterElement(int[] arr){
        int n = arr.length;
        int [] nge=new int[n];
        nge[n-1]=-1;// last element ka next greater element nahi hoga
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek())
               st.pop();
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(nge[i]);
        }
        return result;
    }
    
public static void main(String[] args){
    nextgreaterelement obj=new nextgreaterelement();
    int [] arr={4,5,2,25};
    ArrayList<Integer> result=obj.nextGreaterElement(arr);
    System.out.println(result);
}
}