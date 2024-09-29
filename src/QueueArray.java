

public class QueueArray<E> {
    private E[] queue; // Use Object array
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = (E[]) new Object[capacity]; // Create Object array
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public E enqueue(E item) {
        if (size == capacity) {
            System.out.println("Queue is full.");
            return null;
        }
        rear++;
        queue[rear] = item;
        size++;
        return item;
    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        E item = (E) queue[front]; // Cast Object to E
        front++;
        size--;
        return item;
    }
    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return (E) queue[front]; // Cast Object to E
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
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
