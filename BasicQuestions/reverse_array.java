package BasicQuestions;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int pointer1 = 0;
        int pointer2 = n - 1;
        while (pointer1 < pointer2) {
            int temp = arr[pointer1];
            arr[pointer1] = arr[pointer2];
            arr[pointer2] = temp;
            pointer1++;
            pointer2--;

        }
        System.out.println(Arrays.toString(arr));
    }

}
