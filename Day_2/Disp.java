class MyClass {
    int a, b;


    public MyClass() {
        a = 10;
        b = 15;
    }


    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void disp() {
        System.out.println("a: " + a + ", b: " + b);
    }
}

public class Disp {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.disp();

        MyClass obj2 = new MyClass(20, 25);
        obj2.disp();
    }
}
