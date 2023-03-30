import java.util.Scanner;

public class A1103348_0317_1{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入 n：");
        int n = scanner.nextInt();
        System.out.print("請輸入 m：");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("請輸入 arr[" + i + "][" + j + "] 的值：");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}