package DataStructure.Stacks;
import DataStructure.*;
import java.util.*;

public class ArrayStack {
    private Employee[] stack;
    private int top; //top is the available index

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {

        //make sure we don't get an array outOfBoundException
        if (top == stack.length) {
            // need to resize the backing array, double it
            Employee[] newArray = new Employee[2 * stack.length];
            //copy from the stack, copy from first element, copy into newArray, from the first newArray element, and the length of stack
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        //increment the array index by 1 and assign it to the item being pushed
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top]; //top is the available index
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
