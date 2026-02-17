package javaarrays.Level2;
import java.util.Scanner;
public class EmployeeBonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] emp = new double[10][2]; // salary, years
            double[][] result = new double[10][2]; // bonus, new salary
            double totalOld = 0, totalBonus = 0, totalNew = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Employee " + (i + 1));
                System.out.print("Salary: ");
                emp[i][0] = sc.nextDouble();
                System.out.print("Years of Service: ");
                emp[i][1] = sc.nextDouble();
                if (emp[i][0] <= 0 || emp[i][1] < 0) {
                    System.out.println("Invalid input. Enter again.");
                    i--;
                }
            }
            for (int i = 0; i < 10; i++) {
                double bonusRate = emp[i][1] > 5 ? 0.05 : 0.02;
                result[i][0] = emp[i][0] * bonusRate;
                result[i][1] = emp[i][0] + result[i][0];

                totalOld += emp[i][0];
                totalBonus += result[i][0];
                totalNew += result[i][1];
            }
            System.out.println("Total Old Salary: " + totalOld);
            System.out.println("Total Bonus: " + totalBonus);
            System.out.println("Total New Salary: " + totalNew);
        }
    }


