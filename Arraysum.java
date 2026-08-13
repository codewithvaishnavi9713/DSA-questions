import java.util.Scanner;
public class Arraysum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int[]arr=new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}


    
    

