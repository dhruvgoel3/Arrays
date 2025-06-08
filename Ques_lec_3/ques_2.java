package Ques_lec_3;
// PATTERN :- Array mnaipulation
// Ques =  Find the unique number in a given Array where all the elements are being
// repeated twice with one value being unique.

import java.util.Scanner;

// steps to solve it---
// 1. Traverse all the pairs 
// 2. Pairs which are equal = mark -1
// 3. Traverse array again , value greater than 0 is our answer

public class ques_2 {
    static int findUnique(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1; j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i = 0; i<n;i++ )
        {
            if(arr[i]>0)
            {
                ans = arr[i];
            }
        }
        return ans;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+ size +"Elements of array");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique element is :-"+arr);

;

        
    }
    
}
