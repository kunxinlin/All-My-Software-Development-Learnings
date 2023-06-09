import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GenericsExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher();
        employee = teacher;

        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Teacher>  teachers = new ArrayList<>();
        //employees = teachers; //not valid

        //the question mark is a wildcard
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Teacher>  teachers2 = new ArrayList<>();
        employees2 = teachers2; //valid

        //accepts any childrens of Employee
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Teacher>  teachers3 = new ArrayList<>();
        employees3 = teachers3; //valid


    }


    //first <E> defines what E is.
    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}

class Employee{}
class Teacher extends Employee{}

