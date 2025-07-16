package PRACTICEEEEE;

import java.util.Scanner;

public class count_element_greater_than_x_6 {
    static int greaterElements(int arr[],int x)
    {
        int count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > x)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Elements greater than "+ x + "are:- "+greaterElements(arr, x));

        
    }
    
}
// done
