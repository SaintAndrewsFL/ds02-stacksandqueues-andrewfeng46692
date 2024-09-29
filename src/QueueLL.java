
public class QueueLL<E> {

    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public QueueLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public E enqueue(E item) {
        Node newNode = new Node(item); // Create a new node with the item
        if (rear == null) { // If the queue is empty
            front = newNode; // Both front and rear point to the new node
            rear = newNode;
        } else {
            rear.next = newNode; // Add the new node at the rear
            rear = newNode;      // Update the rear pointer
        }
        size++;
        return item;
    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        E item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            Node current = front;
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
        return size == 0;
    }
}

/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */