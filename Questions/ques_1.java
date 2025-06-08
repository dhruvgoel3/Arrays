package Questions;

// Find the sum of all the elements of a array

public class ques_1 {
    void sumOfArray() {
        int arr[] = { 1, 5, 3 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];

        }
        System.out.println(temp); // 9
    }

    public static void main(String[] args) {
        ques_1 obj = new ques_1();
        obj.sumOfArray();

    }

}
