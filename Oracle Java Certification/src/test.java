public class test {
    public static void main(String[] args) {
        String[] temp = new String[]{"a" ,"b", "c"};
    }

    public final static void f1(){} //modifiers can go in any order before the return type
    final public static void f2(){}
//    static void public f3(){}  //compile error
//    public static void final(){}
}
