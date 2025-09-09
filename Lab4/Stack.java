package lab4;

public class Stack {
    private Person[] stack;
    private int top;

    public Stack(int size) {
        stack = new Person[size];
        top = -1;
    }

    public Stack(Person[] initial) {
        stack = new Person[initial.length];
        top = -1;
        for (Person p : initial) {
            push(p);
        }
    }

    public void push(Person p) {
        if (top < stack.length - 1) {
            stack[++top] = p;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public void push(Person p1, Person p2) {
        push(p1);
        push(p2);
    }

    public Person pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public void pop(int n) {
        if (n > top + 1) {
            System.out.println("Cannot pop " + n + " elements. Only " + (top + 1) + " in stack.");
            return;
        }
        for (int i = 0; i < n; i++) {
            Person p = pop();
            if (p != null) {
                p.displayPerson();
            }
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            stack[i].displayPerson();
        }
    }

    public void display(int n) {
        if (n > top + 1) {
            System.out.println("Only " + (top + 1) + " elements in stack.");
            n = top + 1;
        }
        System.out.println("Top " + n + " persons:");
        for (int i = top; i > top - n; i--) {
            stack[i].displayPerson();
        }
    }
}
