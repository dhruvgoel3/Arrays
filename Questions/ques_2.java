package Questions;
// Find the largest element in the array

public class ques_2 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 24, 6, 73, 54, 77 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }

        }
        System.out.println("Maximum element is:- "+ ans);

    }

}
