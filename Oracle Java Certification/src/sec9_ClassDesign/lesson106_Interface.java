package sec9_ClassDesign;

//interface can extends multiple interfaces vs where class can only extend one class
//interface is always public
public interface lesson106_Interface {
//    int num; //compile error
    public static final int num = 1; //redundant
    int num1 = 1; //variables in interface are default public static final

    //can only be used inside the interface which makes this basically useless
    private void hello(){
        System.out.println("adsads");
    }

    public abstract void hello1(); //redundant
    void hello2(); //methods are by default and can only be: public abstract


    //default method can only be created in a interface
    //must use default keyword and provide a default implementation
    //not assumed to be static final or abstract as it may be used or overridden in the classes that implements it
    //assumed to be public, private or protected will not be compiled

    //used for backward compatibility
//    default int def(); //no body
//    public int def(){} //no default keyword
    public default int def(){return 0;} //public is redundant

    //compile error if a class extends multiple interface that has same default methods and you dont override it


    //static can only be public, need to have a body
    //if we implement 2 interface with same static method it will compile since we need to access it by interface 2name
    public static void hello3(){  //redundant
        System.out.println("static hello3 from interface");
    }

}