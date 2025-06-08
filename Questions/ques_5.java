package Questions;

import java.util.Scanner;

public class ques_5 {
    static int lastOccurence(int arr[], int x) {
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastindex = i;
            }

        }
        return lastindex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x:- ");
        int x = sc.nextInt();
        System.out.println("Last occurence of x is:- " + lastOccurence(arr, x));

    }

}
