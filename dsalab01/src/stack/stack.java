package stack;

public class stack {

    int top;
    int maxSize;
    char[] stackArray;
    
    // Constructor
    public stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    
    // Method isEmpty
    public boolean isEmpty() {
        return (top == -1); // Return true if top is -1 indicating an empty stack
    }
    
    // Method isFull
    public boolean isFull() {
        return (top == (maxSize - 1)); // Return true if top equals maxSize - 1 indicating a full stack
    }
    
    // Method push
    public void push(char ch) {
        if (!isFull()) {
            stackArray[++top] = ch; // Increment top and push the character
        } else {
            System.out.println("Stack is full"); // Error message
        }
    }
    
    // Method pop
    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--]; // Decrement top and return top element from stack
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }
    
    // Method peek
    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
        }
        return 0;
    }
    
    // Method display
    public void display() {
        System.out.println("Printing stack elements:");
        int i = top;
        while (i >= 0) {
            System.out.println(stackArray[i]); // Print the element
            i--; // Decrement i to next element
        }
    }
}
