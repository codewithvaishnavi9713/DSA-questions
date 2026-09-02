import java.util.Arrays;
public class mindiff {
    static int mindiff (int[] arr){
        
        
        int n=arr.length;

        Arrays.sort(arr);

        int diff=Integer.MAX_VALUE;
        
        for(int i=0;i<n-1;i++){
           if(arr[i+1]-arr[i]<diff){
            diff=arr[i+1]-arr[i];
            
            }
            
        }
        return diff;
    }
    public static void main(String[] args){
       int[] arr={1,5,18,19,4};
       System.out.println("minimum difference:"+ mindiff(arr)); 

        }
    }
    

