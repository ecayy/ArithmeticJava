import java.util.Scanner;

public class scan2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Enter number");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = x + y;

        System.out.println("Sum is " + z);
    }


}
