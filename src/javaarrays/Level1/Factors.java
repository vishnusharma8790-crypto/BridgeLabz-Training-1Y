package javaarrays.Level1;
import java.util.Scanner;
public class Factors {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] factors = new int[10];
            int index = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    if (index == factors.length) {
                        int[] temp = new int[factors.length * 2];
                        System.arraycopy(factors, 0, temp, 0, factors.length);
                        factors = temp;
                    }
                    factors[index++] = i;
                }
            }
            for (int i = 0; i < index; i++)
                System.out.print(factors[i] + " ");
        }
    }


