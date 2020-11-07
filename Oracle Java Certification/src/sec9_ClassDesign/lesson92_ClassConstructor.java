package sec9_ClassDesign;

class Dog{
    private String name;
    private String breed;
    private double weight;

    public Dog(String name){
        // has to be the first call in a constructor, or won't compile
        this(name, "husky"); //this() calls the other constructor
    }

    public Dog(String name, String breed){
        System.out.println("in another constructor");
    }


}


public class lesson92_ClassConstructor {
//    public void ClassConstructor(){} // compiles, but not a constructor since it has a return type

//    private ClassConstructor(){}
    //used for like utility classes where there's only static methods
    //singleton classes - limit objects of that class to one

    public lesson92_ClassConstructor(){}

    public static void main(String[] args) {
    }
}
