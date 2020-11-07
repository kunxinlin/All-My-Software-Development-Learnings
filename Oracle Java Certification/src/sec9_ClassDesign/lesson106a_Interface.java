package sec9_ClassDesign;


//default constructor is needed to extend the abstract class

public class lesson106a_Interface extends lesson104_AbstractClasses {
    //hello1 was implement in the abstract class already so dont need to


    //hello2 wasn't, it would have compile error if not implemented here
    public void hello2() {

    }


    //abstract class method needs to be implemented too
    @Override
    public void method4() {

    }

    public static void main(String[] args) {
        lesson106a_Interface test = new lesson106a_Interface();
        test.hello1();
        lesson106_Interface.hello3();
    }
}
