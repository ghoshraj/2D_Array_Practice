package two_d_array;

import java.util.Scanner;

public class SearchAElement {
    public static boolean isPresent(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if (arr[i][j] == key){
                   System.out.println("Item found at : " + "["+ i + "," + j +"]");
                   return true;
               }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int n = sc.nextInt();
        System.out.print("Enter column : ");
        int m = sc.nextInt();
        System.out.print("Enter Key : ");
        int key = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        isPresent(arr , key);
    }
}
