import java.util.Scanner;

public class cubiod {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int height, length, width;
        System.out.println("Enter the values");
        height = s.nextInt();
        length = s.nextInt();
        width = s.nextInt();

        int area = 2 * (length * width + width * height + height * length);
        int volume = length * width * height;
        System.out.println("Area is " + area);
        System.out.println("Volume is " + volume);

    }
}
