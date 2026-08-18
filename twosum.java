public class twosum {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15,10,7};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax && arr[j]<max) smax=arr[j];
            }
        System.out.println("The  largest element in the array is: "+max);
        System.out.println("The second largest element in the array is: "+smax);
        }




            
    
    
}
