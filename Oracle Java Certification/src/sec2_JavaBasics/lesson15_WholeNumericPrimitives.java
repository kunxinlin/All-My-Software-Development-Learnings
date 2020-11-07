package sec2_JavaBasics;

public class lesson15_WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 232323; //default int, that gets converted to long
        //long max2 = 13131313111; //too large for int, to fix this ↓↓
        long max2 = 13_131_313_111L; //add l (use L since lowercase looks like 1) to end, to let compiler know
                                     //can add underscore for readability, can't be at the beginning or end thought. or after decimal

        //Octal 8 (0-7) - starts with 0
        int oct1 = 07; //7
        int oct2 = 010; //8
        int oct3 = 0123; //18


        System.out.println("Decimal: " +oct3);  //default print is always in decimal
        System.out.println("Octal: " + Integer.toOctalString(oct3) + '\n');

        //Hexadecimal 16 (0-9 and A-F(10-15)) - starts with 0x
        int hex1 = 0x1; //1
        int hex2 = 0xF; //15
        int hex3 = 0x10; //16

        System.out.println("Hex" + "\n" + hex1 + "\n" + hex2 + "\n" + hex3 + "\n");

        //Binary (0-1) - starts with 0b
        int bin1 = 0b1;
        int bin2 = 0b10;
        int bin3 = 0b11;

        System.out.println("Binary" + "\n" + bin1 + "\n" + bin2 + "\n" + bin3);
    }
}
