public class segregate0and1 {
   static  void segregate0and1(int arr[], int n) {
        int numberofZeros=0;
        int numberofOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                numberofZeros++;
            } else {
                numberofOnes++;
            }
        }
        for(int i=0;i<numberofZeros;i++){
            arr[i]=0;
        }
        for(int i=numberofZeros;i<n;i++){
            arr[i]=1;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1};
        segregate0and1(arr , arr.length);
        for(int ele:arr){
            System.out.println(ele+" ");
        }
        
    }
}


