package sec5_UnderstandingStrings;

public class lesson46_StringAndConcatenation {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String ("hello"); //redundant

        // +
        //if both numeric, its addition
        //if one is string its, string concatenation

        System.out.println(1+2);
        System.out.println("a" + 'b');
        System.out.println("ab" + 3);

        int three = 3;
        String stringfour = "4";
        System.out.println(1 + 2 + three + stringfour); //goes left to right, numeric addition ->6 then lastly concat '4' -> 64

        int n1 = 10;
        int n2 = 20;
        System.out.println("ans= " + n1 + n2); //string -> string + int so ->string
        System.out.println("ans= " + (n1 + n2));



    }
}
