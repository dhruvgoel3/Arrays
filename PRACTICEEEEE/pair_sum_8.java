package PRACTICEEEEE;

import java.util.Scanner;

public class pair_sum_8 {
    static int targetSum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter" + size + "Elements of a array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target = sc.nextInt();
        System.out.println("Total number of pairs are:-"+ targetSum(arr, target));
    }

}
