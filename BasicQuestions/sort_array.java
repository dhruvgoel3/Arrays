package BasicQuestions;

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int arr[] = {3, 6, 1, 4, 9, 5, 7, 3, 5, 6, 8};
        int n = arr.length;

        for (int i = 1; i < n; i++) {  // Start from 1, as first element is "sorted"
            for (int j = i; j > 0; j--) {  // Move backwards
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;  // Optimization: stop if no more swaps needed
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
