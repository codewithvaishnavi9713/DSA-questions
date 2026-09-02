import java.util.Arrays;
public class movezerostoend {
    
    public static void main(String[] args){
        int[]arr={2,6,0,2,0,9,5};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        
        
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
   
}
}

    

