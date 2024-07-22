package stack;

public class Stackmain {

    public static void main(String[] args) {
        
        int i = 0;
        
        // Create a stack object
        stack thestack = new stack(5);
        
        // Push elements
        thestack.push('s');
        thestack.push('T');
        thestack.push('A');
        thestack.push('C');
        thestack.push('K');
        thestack.push('s');
        thestack.push('T');
        thestack.push('A');
        thestack.push('C');
        thestack.push('K');
        
        // Display the stack
        thestack.display();
        System.out.println("\n");
        
        // Display peek
        System.out.println("Peek value: " + thestack.peek());
        System.out.println("\n");
        
        // Pop elements
        while (!thestack.isEmpty()) {
            char ch2 = thestack.pop();
            
            // Display pop
            System.out.println("Top deleted value: " + (i + 1) + " " + ch2);
            i++;
        }
    }
}
