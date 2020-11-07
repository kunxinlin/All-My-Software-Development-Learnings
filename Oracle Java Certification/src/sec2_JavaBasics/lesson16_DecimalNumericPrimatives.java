package sec2_JavaBasics;

public class lesson16_DecimalNumericPrimatives {
    public static void main(String[] args) {
        float f1 = 12.3f; //f in the end to denote float, decimal are default doubles
        float f2 = (float)12.3; //or cast it
        float f3 = 1.23e4f; //scientific
        System.out.println(f3);
        System.out.println();

        double d1 = 12.34;
        double d2 = 12.34f; //auto-conversion, the f is absolutely useless and redundant
        double scientific = 1.234e4; //scientific notation

        System.out.println(scientific);
        System.out.println();

        //p indicates hexadecimal floating point number
        double hex = 0x2p3; // = 2 x 2^3;
        System.out.println(hex);
    }
}
