public class insertion {
    public static void main(String[] args){
        int[] arr={2,3,1,4,5,9,6,7};

        int n=arr.length;

        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
        
            while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
          arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
