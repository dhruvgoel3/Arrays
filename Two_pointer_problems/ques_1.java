package Two_pointer_problems;
// Sort an array consisting of only 0s and 1s

import java.util.Scanner;

public class ques_1 {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
    static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
 
    static void sortZerosAndOnes(int arr[])
    {
        int n = arr.length;
        int left = 0 ,  right = n-1;
        while(left<right)
        {
            if(arr[left] == 1 && arr[right] == 0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0)
            {
                left++;
            }
            if(arr[right]== 1)
            {
                right--;
            }
        }

    }
    // static void sortZerosAndOnes(int arr[]) {
    //     int n = arr.length;
    //     int zeros = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] == 0) {
    //             zeros++;

    //         }
    //     }
    //     for (int i = 0; i < n; i++) {
    //         if (i < zeros) {
    //             arr[i] = 0;
    //         } else {
    //             arr[i] = 1;
    //         }

    //     }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array ;");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.println("Sorted array:-");
        printArray(arr);

    }

}
