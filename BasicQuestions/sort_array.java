package BasicQuestions;

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int arr[] = {3,6,1,4,9,5,7,3,5,6,8};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            for(int j = i; j>0; j++)
            if(arr[j] < arr[j-1])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }

    
}
