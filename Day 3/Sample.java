public class Sample{
    int a=5;
    int b=9;
    Sample(int a,int b) {
        a = 5;
        b = 9;
    }
    void add(int a,int b){
        a=1;
        b=2;
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Sample s=new Sample(5,6);
        s.add(2,4);
    }
}