package javaarrays.Level2;
import java.util.Scanner;
public class BMI{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number of persons: ");
            int n = sc.nextInt();
            double[] height = new double[n];
            double[] weight = new double[n];
            double[] bmi = new double[n];
            String[] status = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Height (m): ");
                height[i] = sc.nextDouble();
                System.out.print("Weight (kg): ");
                weight[i] = sc.nextDouble();
                bmi[i] = weight[i] / (height[i] * height[i]);
                if (bmi[i] <= 18.4)
                    status[i] = "Underweight";
                else if (bmi[i] <= 24.9)
                    status[i] = "Normal";
                else if (bmi[i] <= 39.9)
                    status[i] = "Overweight";
                else
                    status[i] = "Obese";
            }
            for (int i = 0; i < n; i++) {
                System.out.println("BMI: " + bmi[i] + " Status: " + status[i]);
            }
        }
    }


