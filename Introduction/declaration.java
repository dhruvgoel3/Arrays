package Introduction;

public class declaration {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int arr2[] = new int[5];
        int[] arr3 = new int[5];
        int arr4[];
        arr4 = new int[10];

        System.out.println(arr1[1]); // 4
        System.out.println(arr1.length); // 10
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" "); // 2,4,6,8,10,12,14,16,18,20
        }

    }

}
