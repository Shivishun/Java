class ComplexNumber {
    int real, image;

    public ComplexNumber(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void showC() {
        System.out.print("(" + this.real + " + " + this.image + "i" + ")");
    }

    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);

        System.out.print("First Complex number: ");
        c1.showC();
        System.out.print("\nSecond Complex number: ");
        c2.showC();

        ComplexNumber result = add(c1, c2);
        System.out.print("\nSum of the two complex numbers: ");
        result.showC();
    }
}
