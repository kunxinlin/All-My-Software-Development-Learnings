package sec5_UnderstandingStrings;


public class lesson52_StringBuilderClass {
    public static void main(String[] args) {
        //StringBuilder is more efficient, String are heavy on memory
        //StringBuilder is not immutable, toString is called when actually getting a String back
        StringBuilder sb = new StringBuilder();

        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); //reuses sb without creating a new string each time
        }

        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("start");
        sb2.append("-middle"); //appends to the same object, unlike String it does change the assignment. same return reference
        StringBuilder sb3 = sb2.append("-end"); //sb3 points to the same reference

        System.out.println(sb2);
        System.out.println(sb3);

        //StringBuilder default capacity is 16, but will auto increase if needed
        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("cool"); //b= is redundant
        System.out.println(a); //both is same, since its the same object
        System.out.println(b); //both a and b is pointed to same object

    }
}
