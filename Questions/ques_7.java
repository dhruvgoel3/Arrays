package Questions;

import java.util.Scanner;

public class ques_7 {
    static boolean isSorted(int arr[]) {
        boolean check = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                check = true;
                break;
            }

        }
        return check;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + "Elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));

    }

}
