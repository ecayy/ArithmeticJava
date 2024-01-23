public class maskingandmerging {
    public static void main(String[] args)
    {
        int a = 10, b=15;
        a=a^b;
        b=a^b;
        a=a^b;

        byte x = 9, y=12;
        byte z;
        z= (byte)(x<<4);
        z=(byte)(z|y);


        System.out.println(a + " " + b);

    }
}
