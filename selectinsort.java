public class selectinsort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 12, 4, 1, 5, 8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // This is for printing the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }



    }
}
