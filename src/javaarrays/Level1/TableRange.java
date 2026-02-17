package javaarrays.Level1;
import java.util.Scanner;
public class TableRange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] result = new int[4];
            int j = 0;
            for (int i = 6; i <= 9; i++) {
                result[j++] = num * i;
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }
    }

