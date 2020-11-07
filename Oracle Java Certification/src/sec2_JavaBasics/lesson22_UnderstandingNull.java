package sec2_JavaBasics;

//Variable is a reference to a Object
//Null means there is an empty reference
//think of variable as a container for object, when null it means it's an empty container
public class lesson22_UnderstandingNull {
    //Java, everything is a Object, and extends from it.
    static Object object = new Object();
    static Object object2; //same as object2 = null
    static String string;

    public static void main(String[] args) {
        Object localObject = new Object();

        //can say the print the address in memory but really it prints the hashcode
        System.out.println("object1: " + object);
        System.out.println("object2: " + object2);
        System.out.println("localObject: " + localObject);

//        string.toLowerCase(); //will throw a runtime exception "java.lang.NullPointerException" since it points to nothing

        string = "STRING";
        System.out.println(string.toLowerCase());
    }
}
