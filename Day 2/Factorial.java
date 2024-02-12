public class Factorial{
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            int squared = i * i;
            long factorial = calculateFactorial(squared);
            System.out.println("Factorial of " + squared + " is: " + factorial);
        }
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

