package Questions;

import java.util.Scanner;

public class ques_6 {
    static int strictlyGreater(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
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
        System.out.println("Enter the value of x:-");
        int x = sc.nextInt();
        System.out.println("Count of elements is:-" + strictlyGreater(arr, x));

    }

}
