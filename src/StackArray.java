
public class StackArray<E> {
    private E[] stack;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stack = (E[]) new Object[capacity];
        this.top = -1;
    }

    public E push(E item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full.");
            return null;
        }
        stack[++top] = item;
        return item;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack[top--];
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */