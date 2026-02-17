package javaarrays.Level1;
import java.util.Scanner;
public class NumberCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0)
                    System.out.println(arr[i] % 2 == 0 ? "Positive Even" : "Positive Odd");
                else if (arr[i] < 0)
                    System.out.println("Negative");
                else
                    System.out.println("Zero");
            }
            if (arr[0] == arr[4])
                System.out.println("Equal");
            else if (arr[0] > arr[4])
                System.out.println("First is greater");
            else
                System.out.println("Last is greater");
        }
    }

