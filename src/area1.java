import java.util.Scanner;

public class area1 {
    public static void main(String[] args)
    {
        float a, b, c, s;
        double area;
        System.out.println("Enter value for a, b and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = 0.5f * (a + b + c);
        System.out.println("S is " + s);

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is " + area);

    }
}
