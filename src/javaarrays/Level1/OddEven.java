package javaarrays.Level1;
import java.util.Scanner;
public class OddEven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input");
                return;
            }
            int[] odd = new int[num / 2 + 1];
            int[] even = new int[num / 2 + 1];
            int o = 0, e = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) even[e++] = i;
                else odd[o++] = i;
            }
            System.out.println("Odd:");
            for (int i = 0; i < o; i++) System.out.print(odd[i] + " ");

            System.out.println("\nEven:");
            for (int i = 0; i < e; i++) System.out.print(even[i] + " ");
        }
    }


