package PRACTICEEEEE;

import java.util.Scanner;


    // static void searchElement(int arr[] , int x)
    // {
    // int n = arr.length;
    // for(int i = 0; i<n; i++)
    // {
    // if(arr[i] == x)
    // {
    // System.out.println("Element present found"+i);
    // }
    // else
    // {
    // System.out.println("-1");
    // }
    // }
    // }

    import java.util.Scanner;

public class search_element_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :-");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements of the array :-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        boolean found = false; // flag to track if x is found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break; // stop searching after first match
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

