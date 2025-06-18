package Prefix_Sum;
//  Pattern :- Prefix sum questions / running sum 

import java.util.Scanner;

public class ques_1 {
    static int[] makePrefixSumArray(int arr[]) {
        int n = arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for (int i = 0; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(makePrefixSumArray(arr));

    }

}
