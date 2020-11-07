package sec5_UnderstandingStrings;

public class lesson48_StringPoolAndStringEquality {
    public static void main(String[] args) {
        String kris1 = "Kris"; //goes to the string pool
        String kris2 = "Kris";
        String kris3 = "Kr" + "is";
        String kris4 = new String("Kris"); //create a new string obj in the java heap

        System.out.println(kris1 == kris2);
        System.out.println(kris1 == kris3);
        System.out.println(kris1 == kris4);

        String abc = "abc";
        String ab = "ab";
        String str1 = ab + 'c'; //new string concat created at runtime from a variable, not a constant
        String str2= "ab" + "c";
        String str3 = "ab".trim() + 'c'; //anything computed at runtime creates new reference

        System.out.println(abc == str1);
        System.out.println(abc == str2);
        System.out.println(abc == str3); //trim() is computed at runtime therefore false
    }
}
