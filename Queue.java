class Queue {
    public static void main(String[] args) {
        System.out.println("Queue implementation: first in last out");
        {
        System.out.println("Queue implementation using array");
        QueueArray queue1 = new QueueArray(7);
        System.out.println("queue1.isEmpty(): " + queue1.isEmpty());
        queue1.enqueue('k');
        queue1.enqueue('u');
        queue1.enqueue('n');
        queue1.enqueue('g');
        queue1.enqueue('f');
        queue1.enqueue('u');
        queue1.enqueue('!');
        System.out.println("peak: " + queue1.peek());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        queue1.enqueue('o');
        queue1.enqueue('o');
        queue1.enqueue('g');
        queue1.enqueue('w');
        queue1.enqueue('a');
        queue1.enqueue('y');
        queue1.enqueue('!');
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        queue1.enqueue('t');
        queue1.enqueue('o');
        queue1.enqueue('g');
        queue1.enqueue('o');
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());   
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        }
        {
        System.out.println("Queue implementation using circular linked list");
        QueueCircularLinkedList queue2 = new QueueCircularLinkedList();
        System.out.println("queue2.isEmpty(): " + queue2.isEmpty());
        queue2.enqueue('t');
        queue2.enqueue('a');
        queue2.enqueue('n');
        queue2.enqueue('g');
        queue2.enqueue('l');
        queue2.enqueue('e');
        queue2.enqueue('d');
        System.out.println("peak: " + queue2.peek());
        System.out.println("queue2.isEmpty(): " + queue2.isEmpty());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        System.out.println(queue2.dequeue());
        }
    }
}
class QueueArray {
    public char array1[];
    private int rear = 0;
    private int front = 0;
    QueueArray(int size) {
        array1 = new char[size];
    }
    public void enqueue(char c) {
        if(rear < array1.length) {
            array1[rear++] = c;
            System.out.println("Enqueue: " + array1[rear-1]);
        } else {
            if(rear == front) {
                rear = front = 0;
                enqueue(c);
            } else if (front != 0) {
                System.out.println("Might take some time! Will update soon!" + "shifting " + (rear-front) + " records");
                for (int i = 0; i < rear-front; i++) {
                    System.out.println("array1[i]" + array1[i]);
                    array1[i] = array1[front + i];
                    System.out.println("Updated: array1[i]" + array1[i]);
                }
                System.out.println("health: " + "Front: "+ front + "Rear: " + rear);
                rear = rear - front;
                front = 0;
                System.out.println("health: " + "Front: "+ front + "Rear: " + rear);
                enqueue(c);
            } else {
                System.out.println("Array full! Can't update: " + c + ". Front index at: " + front + ". Rear index at: " + rear);
            }
        }
    }
    public char dequeue() {
        if(front == rear) {
            System.out.println("Empty, so returning a");
            return 'a';
        }
        char temp;
        temp = array1[front];
        array1[front++] = 'a';
        return temp;
    }
    public boolean isEmpty() {
        if(rear == front) {
            rear = front = 0;
            return true;
        } else {
            return false;
        }
    }
    public char peek() {
        if(rear == front) {
            return 'a';
        }
        return array1[front];
    }
}

class QueueCircularLinkedList {
    Node rear;
    public void enqueue(char c) {
        if(rear == null) {
            rear = new Node(c);
            System.out.println("Added: " + rear.getData());
        } else {
            Node newNode = new Node(c);
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
            System.out.println("Added: " + rear.getData());
        }
    }
    public char dequeue() {
        if(rear == null) {
            return 'a';
        } else {
            char temp = rear.next.getData();
            rear.next = rear.next.next; 
            return temp;
        }
    }
    public boolean isEmpty() {
        return rear == null;
    }
    public char peek() {
        return rear.next.getData();
    }
}

class Node {
    private char c;
    Node next;
    public Node(char c) {
        this.c = c;
    }
    public char getData() {
        return c;
    }
    public void setData(char c) {
        this.c = c;
    } 
}
