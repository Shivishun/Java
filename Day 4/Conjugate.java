class Conjugate {
    int real, imag;

    public Conjugate(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public void showC() {
        System.out.print("(" + this.real + " + " + this.imag + "i" + ")");
    }

    public ComplexNumber getConjugate() {
        return new ComplexNumber(this.real, -this.imag);
    }

    public static void main(String[] args) {
        Conjugate c1 = new Conjugate(3, -4);
        Conjugate conjugate = c1.getConjugate();

        System.out.print("Complex number: ");
        c1.showC();
        System.out.print("\nConjugate: ");
        conjugate.showC();
    }
}
