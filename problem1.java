import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }  
        for(int i=0;i<num;i++){
            if(i%2==0){
                System.out.println(arr1[i]*10);
            }
            else{
                System.out.println(arr1[i]*2);

                           }
        }

    }
    
}
