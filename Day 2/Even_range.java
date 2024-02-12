import java.util.Scanner;
public class Even_range {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter :");
        int i = n.nextInt();
        for (int j = 0; j <= i; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        for (int j = 0; j <= i; j++){
            int k=i/2;
            System.out.println("Middle number is :"+k);
            break;
        }
    }
}