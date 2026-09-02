import java.util.Arrays;
public class dublicate {
     static void finddublicate(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("dublicate element:"+arr[i]);
            }

        }
    
    }
    public static void main(String[] args){
       int[] arr={1,3,4,5,3,6};
       finddublicate(arr);
    }
    
}
