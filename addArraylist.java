import java.util.ArrayList;
public class addArraylist{
    public static void main(String[] args) {
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(2);
        arr1.add(5);
        ArrayList<Integer>arr2=new ArrayList<>();
        arr2.add(4);
        arr2.add(7);
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.size(); i++) {
            ans.add(arr1.get(i) + arr2.get(i));
        }

        System.out.println(ans);
    }
   
}
    
        
