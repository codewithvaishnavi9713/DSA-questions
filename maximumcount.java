 public class maximumcount {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int lo=0,hi=n-1;
        int count=0;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>0){
                hi=mid-1;//left mejao
            }
            else{
                lo=mid+1;//right mr jao
            }
                
             
        }

        int pos=n-lo;
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>=0){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        int neg=lo;
        return Math.max(pos,neg);
    
    } 
}
