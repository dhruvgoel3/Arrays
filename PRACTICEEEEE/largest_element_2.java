package PRACTICEEEEE;

import java.util.Scanner;

public class largest_element_2 {
    static int findLargest(int arr[]) {
        int Largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        return Largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :-");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements of the array :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element is :-" + findLargest(arr));
    }

}
