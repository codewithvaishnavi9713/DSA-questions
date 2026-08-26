public class merge2shortedarray {
    public static void main(String[] args) {
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8};
        int[] c=new int[a.length + b.length];
        merge(c,b,a);
        for(int ele:c){
            System.out.println(ele+" ");
        }
    }
    
    public static void merge(int[] c, int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
    }

}
