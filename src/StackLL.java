public class StackLL<E> {
    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public StackLL() {
        top = null;
        size = 0;
    }

    public E push(E item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
        return item;
    }

    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        E item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
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