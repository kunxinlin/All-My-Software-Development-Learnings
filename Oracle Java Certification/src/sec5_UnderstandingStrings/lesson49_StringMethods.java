package sec5_UnderstandingStrings;

public class lesson49_StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";

        System.out.println("str Length: " + str.length());

        System.out.println("str Char at: " + str.charAt(1));
//        System.out.println("str Char at: " + str.charAt(11)); //throws out of indexoutofbound

        System.out.println("index of 'a': " + str.indexOf('a')); //first match
        System.out.println("index of 'a' from index2: " + str.indexOf('a', 2));
        System.out.println("index of \"fun\": " + str.indexOf("fun"));
        System.out.println("index of \"fun\" from index10: " + str.indexOf("fun", 10)); //-1 for not found

        System.out.println(str.substring(8)); //from index 8 to the end of the string
        System.out.println(str.substring(0,4)); //4 is exclusive
        System.out.println(str.substring(4,4)); //empty string
//        System.out.println(str.substring(4,2)); //IndexOfOutBound
//        System.out.println(str.substring(4,15));

        System.out.println(str = str.toUpperCase());
        System.out.println(str);

        str.equals("asd");
        str.equalsIgnoreCase("asd");
        str.startsWith("a");
        str.endsWith("a");
        str.contains("a"); //anywhere in the string

        System.out.println(str.codePointAt(1)); //return the ascii number

        String myString = " Java Fun YO";
        System.out.println(myString.replace("ava", "xyz"));

        System.out.println(myString.trim()); //remove leading and ending white spaces


    }
}
