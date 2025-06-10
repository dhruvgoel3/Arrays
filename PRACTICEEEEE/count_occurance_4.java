package PRACTICEEEEE;

import java.util.Scanner;

public class count_occurance_4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " + size + " Elements of the array :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of element");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }

        }
        System.out.println("Occurance of element is :-" + count);
    }

}
