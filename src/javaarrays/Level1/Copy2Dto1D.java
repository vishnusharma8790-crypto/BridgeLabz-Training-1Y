package javaarrays.Level1;
import java.util.Scanner;
public class Copy2Dto1D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            int[] arr = new int[r * c];
            int index = 0;
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    matrix[i][j] = sc.nextInt();
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    arr[index++] = matrix[i][j];
            for (int x : arr)
                System.out.print(x + " ");
        }
    }


