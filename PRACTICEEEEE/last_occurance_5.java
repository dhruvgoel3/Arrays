package PRACTICEEEEE;

import java.util.Scanner;

public class last_occurance_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 4, 2, 5, 6, 4, 2, 6 };
        int x = sc.nextInt();
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;

            }
        }
        System.out.println("Last occurance of " + x + "is at :-" + lastIndex);

    }

}
// done