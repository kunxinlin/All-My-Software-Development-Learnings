import java.util.Arrays;
import java.util.Locale;

public class StringMethodsExample {
    public static void main(String[] args) {
        String s1 = "apple1";
        String s2 = "dog";
        String s3 = "Dog";

        s1.charAt(1);
        s1.toLowerCase();
        s1.toUpperCase();

        System.out.println("toCharArray:");
        System.out.println(Arrays.toString(s1.toCharArray()));

        System.out.println();
        System.out.println("chars() IntStream, CodePoint/ASCII:");
        s1.chars().forEach(x -> System.out.print(x + " ")); //chars() return an intStream
        System.out.println();
        System.out.println(s1.codePointAt(0)); //return the unicode code point (ascii number) at the specificed index


        System.out.println("\ncompareTo():");
        System.out.println(s1.compareTo(s2)); //compare to a string Lexicographically, returns 0 if equal, negative if it precedes
        System.out.println(s1.compareTo(s3)); //positive if it follows
        System.out.println(s1.compareToIgnoreCase("APPLE1")); //ignores case

        System.out.println();
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3)); //ignore the case

        System.out.println();
        System.out.println("Pineapple".replaceAll(Character.toString('p'), "b"));
        System.out.println("Pineapple".contains("apple"));
        System.out.println("Pineapple".endsWith("pples"));

        System.out.println("\nFormat");
        //% indicate start of the formatted that will be subbed with the 2nd argument
        System.out.println(String.format("Hello %s %+d", s1, 12)); //d for integer, f for floating point
        System.out.println(String.format("The spaces is %-20.5f left justified ", 12345.6)); // 20 spaces, including the characters, and to 5decimal places


        System.out.println(Arrays.toString(s1.getBytes())); //bytes are the default charset (ASCII value)


    }

    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "b"); //replaceAll takes in a String
    }
}
