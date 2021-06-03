package Lists.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));
        //employeeList.forEach(employee -> System.out.println(employee));

        //System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
        //employeeList.forEach(employee -> System.out.println(employee));

        //can get the backing array, but it'll just be as Objects
        Object[] empArray = employeeList.toArray();

        //to switch it to a Employee array, need to specify by passing the type we want and the length of it which is .size()
//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

        //need to implement our own equals methods first to correctly use these 2 methods
        //otherwise its checking to see if its the same exact instance(mem address)
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
