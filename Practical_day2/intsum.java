class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }


    public double sum(double a, double b) {
        return a + b;
    }


    public int intsum(int b, int a) {
        return a + b;
    }
}

public class intsum {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        System.out.println("Sum of 5 and 10: " + calculator.sum(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + calculator.sum(5, 10, 15));


        System.out.println("Sum of 3.5 and 2.5: " + calculator.sum(3.5, 2.5));


        System.out.println("Sum of 7 and 3: " + calculator.sum(7, 3));
    }
}
