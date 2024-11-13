package two_d_array;

import java.util.Scanner;

public class RightDiagonalSum {
    public static int rightdiagonalsum(int arr[][]) {
        int sum = 0;

//        approach - 1
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[0].length; j++){
//               if (i + j == arr.length-1)
//                   sum += arr[i][j];
//            }
//        }

        //approach - 2
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][arr.length - 1 - i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int n = sc.nextInt();
        System.out.print("Enter column : ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(rightdiagonalsum(arr));
    }
}
