package PRACTICEEEEE;

import java.util.Scanner;
// Ques =  Finf the sum of all the elements in the arrayj

public class sum_of_all_elements_1 {
    static int sumOfElements(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = arr[i] + ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :-");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " Elements of the array :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sum of all the elements of the array is :-" + sumOfElements(arr));
    }

}
