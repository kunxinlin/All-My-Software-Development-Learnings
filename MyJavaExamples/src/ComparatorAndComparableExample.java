import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;
    Dog() {
    }

    Dog(String n, int a) {
        name = n;
        age = a;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    // Overriding the compareTo method
    //Comparable
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Overriding the compare method to sort the age
    //Comparator
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}

public class ComparatorAndComparableExample {

    public static void main(String args[]) {

        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        //need the comparable to use this, otherwise it'll throw an error
        //since it doesn't know how to sort our Dog class
        //sort with 1arg use the internal comparable
        Collections.sort(list);   // Sorts the array list

        for(Dog a: list)
            System.out.print(a.getDogName() + ", ");

        // Sorts the array list using comparator
        //sort with 2args, takes comparator as an argument
        //since our class is also a comparator, just invoke an instance of it, it'll know to use the compare method
        Collections.sort(list, new Dog());
        System.out.println(" ");

        for(Dog a: list)   // printing the sorted list of ages
            System.out.print(a.getDogName() +": "+ a.getDogAge() + ", ");
    }
}
