package sec5_UnderstandingStrings;

public class lesson53_StringBuilderMethods {
    public static void main(String[] args) {
        //charAt(), indexOf(), length(), substring()

        //0 1 2 3 4 5 6 7 8 9 10
        //p r o g r a m m i n g
        StringBuilder s = new StringBuilder("programming");
        String sub = s.substring(s.indexOf("g"), s.indexOf("mi")); //m is at index 7 which is excluded ->gram

        System.out.println(sub);

        s.append(1.0);
        System.out.println(s);

        s.insert(1, 'X'); //insert before the character at the index
        System.out.println(s);

        s.deleteCharAt(1);
        System.out.println(s);

        s.delete(1,1);  //doesn't change anything
        s.delete(s.length()-3, s.length());
        System.out.println(s);

        System.out.println(s.reverse());
        String temp = s.toString();
    }
}
