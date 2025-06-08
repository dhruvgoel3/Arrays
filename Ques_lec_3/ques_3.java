package Ques_lec_3;
// Find the second largest element of the array

// --> Approach ->
// 1. Finding the maximum value, 2. Mark all max as -infinity 
// 3. Now again check the largest element ... now we will be getting the seconf largest

import java.util.Scanner;

public class ques_3 {
    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }

        }
        return mx;

    }

    static int findSecondMax(int arr[]) {
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;

            }
        }
        int secondMax = findMax(arr);
        return secondMax;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest element is;- " + findSecondMax(arr));

    }

}
