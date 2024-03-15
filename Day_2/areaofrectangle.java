class Base {

    public void area(int a, int b) {
        System.out.println("Area of the square: " + (a * a));
    }
}

class Derived extends Base {

    @Override
    public void area(int length, int width) {
        System.out.println("Area of the rectangle: " + (length * width));
    }
}

public class areaofrectangle {
    public static void main(String[] args) {
        Base baseObj = new Base();
        Derived derivedObj = new Derived();


        baseObj.area(5, 0);

        derivedObj.area(6, 4);
    }
}
