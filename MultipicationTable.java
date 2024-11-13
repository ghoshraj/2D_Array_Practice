package two_d_array;

import java.util.Scanner;

public class MultipicationTable {
    public static void multiply(int arr[][],int arr1[][]){
        int row = Math.max(arr.length,arr1.length);
        int column = Math.max(arr[0].length,arr1[0].length);
       int ans[][] = new int[row][column];

       for (int i = 0; i < row; i++){
           for (int j = 0; j < column; j++){
               if ((i < arr.length && j < arr1[0].length)&&(j < arr.length && i < arr1[0].length)) {
                   ans[i][j] = arr[i][j] * arr1[i][j];
                   System.out.print(ans[i][j] + " ");
               }
               else if (j >= arr1[0].length){
                   ans[i][j] = arr[i][j];
                   System.out.print(ans[i][j] + " ");
               }
               else if (j >= arr[0].length){
                   ans[i][j] = arr1[i][j];
                   System.out.print(ans[i][j] + " ");
               }
               else if (i >= arr.length){
                   ans[i][j] = arr1[i][j];
                   System.out.print(ans[i][j] + " ");
               }
               else{
                   ans[i][j] = arr[i][j];
               }
           }
           System.out.println();
       }
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
        System.out.print("Enter row : ");
        int n1 = sc.nextInt();
        System.out.print("Enter column : ");
        int m1 = sc.nextInt();
        int arr1[][] = new int[n1][m1];
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("_________________________");
        multiply(arr,arr1);
    }
}
