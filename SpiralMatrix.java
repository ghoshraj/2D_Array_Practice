package two_d_array;


import java.util.Scanner;

public class SpiralMatrix {
    public static void Spiral(int arr[][]){
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcoloum = 0;
        int endcolumn = arr[0].length - 1;

        while (startrow <= endrow && startcoloum <= endcolumn){
            //top
            for (int i = startcoloum; i <= endcolumn; i++){
                System.out.print(arr[startrow][i] + " ");
            }
            System.out.println();
            //right
            for (int i = startrow + 1; i <= endrow; i++){
                System.out.print(arr[i][endcolumn] + " ");
            }
            System.out.println();
            //buttom
            for (int i = endcolumn - 1; i >= startcoloum; i--){
                System.out.print(arr[endrow][i] + " ");
            }
            System.out.println();
            //left
            for (int i = endrow - 1; i >= startrow + 1; i--){
                System.out.print(arr[i][startcoloum] + " ");
            }
            System.out.println();
            startrow++;
            endrow--;
            startcoloum++;
            endcolumn--;
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
        Spiral(arr);
    }
}
