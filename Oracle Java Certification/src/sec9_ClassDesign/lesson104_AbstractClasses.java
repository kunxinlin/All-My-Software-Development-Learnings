package sec9_ClassDesign;

//cant be instantiated directly
//can have 0 to many abstract methods
//cannot be private or final
//abstract class that extends another abstract class, inherits all of the abstract methods as it's own abstract methods
//first concrete class that extends an abstract class must provide implementation for all the abstract methods
public abstract class lesson104_AbstractClasses implements lesson106_Interface {
    //abstract methods can only be defined in abstract classes
    //cannot be private or final
    //must not have body/implementation

//    private abstract void method1(){} //wont compile
//    public static abstract void method2();
//    public abstract void method3(){}

    public abstract void method4();  //can be protected as well

    private int num;
//    final int num1;
    public static int num2;
//    public static final int num3;

    //constructors are allowed
    public lesson104_AbstractClasses(){
    }

    public void setNum(int num){
        this.num = num;
    }

    public void hello1(){
        System.out.println("hello1 from interface implemented in abstract class");
    }

}
