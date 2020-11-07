package sec9_ClassDesign;
// order of initialization
// 1. superclass/parent class
// 2. static variable and initializers in order they appear
// 3. instance variable declaration and initializer in order they appear
// 4. the constructor

class Example {
    private String name = "dog";

    //instance initializer - bad practice, can be done in constructor
    {
        System.out.println(name);
    }

    private static int count= 0;

    {
        count += 10;
        System.out.println(count);
    }

    //static initializer
    static {
        System.out.println(count);
    }

    public Example(){
        System.out.println("constructor");
    }

}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.println(number + " ");
    }

    Demo() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }
}

public class lesson96_OrderOfInitialization {
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println();
        new Demo(); //this instance is called by never saved
    }
}
