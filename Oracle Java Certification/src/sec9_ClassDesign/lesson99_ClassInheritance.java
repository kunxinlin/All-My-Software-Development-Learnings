package sec9_ClassDesign;

class Animal{

    private int age;

    public Animal(int age){
        System.out.println("Animal");
    }

    protected void bark(){
        System.out.println("animal soundzz");
    }

}

class Dog1 extends Animal{
    public Dog1(int age){
        super(age);
        System.out.println("Dog");
    }

/*   override is not needed, but its good for readability and if you make a mistake in overriding it would throw compile error
     vs if you dont have the override keyword and make a mistake add extra parameter or something you would have a new method
     and if you change the overriden method signature it would throw compile error for the rest of the sub methods that overrides it
     so it's easier to identify
*/
    @Override //can change access modifier, cant override final or private
    public void bark(){
        System.out.println("woof");
    }

}

class Husky extends Dog1{
    public Husky(int age){
        super(age);
//        super(); //this calls the parent class constructor and this is called automatically behind the scene
        //won't work if parent constructor takes in arguement
        //also super needs to be the first line in the constructor or won't compile
        System.out.println("Husky");
    }
}

public class lesson99_ClassInheritance {
    public static void main(String[] args) {
        Husky husky = new Husky(3);

        Dog1 dog = husky; //another reference to husky
        //Polymorphism - can be used as any of the classes within it's hierarchy and it's implemented interfaces
        // only methods available to the reference type are callable

        Animal doge = new Dog1(2);
        Dog1 doge1 = (Dog1)doge; //can cast down
    }
}
