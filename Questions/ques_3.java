package Questions;

// Search the element x in the array . if present then return the index else return -1
public class ques_3 {
    public static void main(String[] args) {
         int arr[] = {1,5,3,5,6,4};
         int X = 6;
         for(int i = 0;i<arr.length;i++)
         {
            if(arr[i] == X)
            {
                System.out.println("Element found at index:- "+ i);
            }
            else
            {
                System.out.println("-1");
            }
         }
    }

}
