package Ques_lec_3;
// PATTERN : Target sum... Find the number of pairs in array whose some is "Target"

import java.lang.annotation.Target;
import java.util.Scanner;

public class ques_1 {
    static int pairSum(int arr[], int Target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == Target) {
                    ans++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Targer number:-");
        int Target = sc.nextInt();
        System.out.println("Number of pairs are :-"+pairSum(arr, Target));

    }

}
