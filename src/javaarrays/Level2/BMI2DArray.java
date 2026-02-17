package javaarrays.Level2;
import java.util.Scanner;
public class BMI2DArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();
            double[][] personData = new double[n][3]; // weight, height, BMI
            String[] weightStatus = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nPerson " + (i + 1));
                System.out.print("Enter weight (kg): ");
                double weight = sc.nextDouble();
                if (weight <= 0) { i--; continue; }
                System.out.print("Enter height (m): ");
                double height = sc.nextDouble();
                if (height <= 0) { i--; continue; }
                double bmi = weight / (height * height);
                personData[i][0] = weight;
                personData[i][1] = height;
                personData[i][2] = bmi;
                if (bmi < 18.5)
                    weightStatus[i] = "Underweight";
                else if (bmi < 25)
                    weightStatus[i] = "Normal";
                else if (bmi < 30)
                    weightStatus[i] = "Overweight";
                else
                    weightStatus[i] = "Obese";
            }
            System.out.println("\n--- BMI Details ---");
            for (int i = 0; i < n; i++) {
                System.out.println("Person " + (i + 1) +
                        " | Weight: " + personData[i][0] +
                        " | Height: " + personData[i][1] +
                        " | BMI: " + personData[i][2] +
                        " | Status: " + weightStatus[i]);
            }
        }
    }

