package testpractice;

public class friendlypair {


        static int sumOfDivisors(int n) {
            int sum = 0;
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            int a = 6;
            int b = 28;

            double ratio1 = (double) sumOfDivisors(a) / a;
            double ratio2 = (double) sumOfDivisors(b) / b;

            if(ratio1 == ratio2) {
                System.out.println("Yes, they are a friendly pair");
            } else {
                System.out.println("No, they are not a friendly pair");
            }
    }
}