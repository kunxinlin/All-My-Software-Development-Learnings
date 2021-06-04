package Lists;


//not using generics, we will use Java's LinkList
//this just for learning and we would only need to write generic if we are writing a class to be released publicly
public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;  //for doublylinkedlist

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return employee.toString();
    }
}
