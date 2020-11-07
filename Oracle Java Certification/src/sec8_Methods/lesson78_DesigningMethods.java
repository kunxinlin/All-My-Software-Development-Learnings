package sec8_Methods;

public class lesson78_DesigningMethods {
    //minimum for method to compile, return type, parameter, and body
    void f(){
        return; //redundant
    }
    public final static void f1(){} //modifiers can go in any order before the return type
    final public static void f2(){}
//    static void public f3(){}  //compile error
//    public static void final f4(){}

    //all methods must have a return type and if not void, need to have at least one return statement
//    int getInt(){
//        if(1<2){
//            return 1;
//        }
//    } //need another return outside of loops, ones in conditionals are not sufficient

//    void 1test(){} //can't start with numerics
//    void void(){} //cant have keywords as methods name
    void $test(){}
    void _test(){}

    public static void main(String[] args) {
    }
}
