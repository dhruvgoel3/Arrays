package PRACTICEEEEE;

import java.util.Scanner;

public class find_unique_element_8 {
    static int  findUniqueElement(int arr[])
{
    int n = arr.length;
    for(int i = 0; i<n;i++)
    {
        for(int j = i+1;j<n;j++)
        {
            if(arr[i] == arr[j])
            {
                arr[i] = -1;
                arr[j] = -1;
            }
        }
    }
    int ans = -1;
    for(int i = 0; i<arr.length; i++)
    {
        if(arr[i] > 0)
        {
            ans = arr[i];
        }
    }
    return ans;


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
        System.out.println("The unique element is :-"+ findUniqueElement(arr));
    }

}
// done 