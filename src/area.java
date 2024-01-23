import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        float height, base, area;
        System.out.println("Enter base and height ");

        Scanner sc = new Scanner(System.in);
        height = sc.nextFloat();
        base = sc.nextFloat();

        area = (height * base)*0.5f;

        System.out.println(" area is " + area);





    }
}
