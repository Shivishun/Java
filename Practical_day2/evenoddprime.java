class Parent {

    public void even() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public void odd() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public void prime() {
        System.out.println("Prime numbers:");
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Child extends Parent {
    
    @Override
    public void even() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void odd() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void prime() {
        System.out.println("Prime numbers:");
        for (int i = 2; i <= 30; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class evenoddprime {
    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        child.odd();
        child.prime();
    }
}
