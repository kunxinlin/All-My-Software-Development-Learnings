package sec2_JavaBasics; // <- package is always first

//then any imports

//then class, which is always required at least 1 class
class Class1{

}

//can only have 1 public class
public class lesson21_ElementOrderInAClass {
    //variables can go anywhere inside a class

    //methods needs to be inside a class, but no required
    public static void main(String[] args) {

        //can't have a method inside another method
/*        public static void innerMethod(){

        }*/
    }
}

class Class2{

}

//any other ordering will throw compile error