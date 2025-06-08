package Ques_lec_4;

// Swap two numbers using temporary variable.
public class ques_1 {
    static void swap(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
    }

}
