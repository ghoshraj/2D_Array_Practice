package two_d_array;

import java.util.Scanner;

public class SearchElementInSortedMatrix {
    public static boolean search(int arr[][] , int key){
        int row = 0;
        int column = arr[0].length - 1;
        while (row < arr.length && column >= 0){
            if (arr[row][column] == key) {
                System.out.println("Item found at : (" + row + "," + column + ")");
                return true;
            }
            else if (key < arr[row][column])
                column--;
            else
                row++;
        }
        System.out.println("Item not found");
        return false;
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
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        search(arr,key);
    }
}
