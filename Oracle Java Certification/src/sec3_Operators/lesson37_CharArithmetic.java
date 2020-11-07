package sec3_Operators;

public class lesson37_CharArithmetic {
    public static void main(String[] args) {
        //char 0-65535
        char myCharA = 'A';
        char myChar6 = '6';

        //exam ex.
        char asciiA = 65;
        int myInt = asciiA + 3;
        char temp = (char) myInt;

        System.out.println(temp);

        char newChar = (char)(temp+2);
        System.out.println(newChar);
        System.out.println(++newChar);
    }
}
