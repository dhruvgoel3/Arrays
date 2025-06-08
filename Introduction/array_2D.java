package Introduction;

public class array_2D {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int [][] arr2 = {{2,3,4},{5,6,7},{7,8,9}};
        System.out.println(arr.length);
        System.out.println(arr2.length);
        for(int i = 0;i<3; i++)
        {
          for(int j = 0;j<3;j++)
          {
            System.out.print(arr2[i][j]+ " ");
          }
        }
    }
    
}
