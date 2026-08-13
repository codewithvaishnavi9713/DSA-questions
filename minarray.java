import java.util.Scanner;

public class minarray {
    public static void main(String[] args){
          Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }
        int min=arr1[0];
        for(int i=1;i<num;i++){
            if(arr1[i]<min)min=arr1[i];
        }
        System.out.println("The minimum element in the array is: "+min);

    }
    
}
