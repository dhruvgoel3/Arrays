package Ques_lec_3;

import java.util.Scanner;

public class ques_4 {
    static int firstRepeatingNumber(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }

            }

        }
        return -1;

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
        System.out.println("First Repeating element is : " + firstRepeatingNumber(arr));
    }

}
