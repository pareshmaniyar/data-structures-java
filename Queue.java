class Queue {
    public static void main(String[] args) {
        System.out.println("Queue implementation: first in last out");
        QueueArray queue1 = new QueueArray(40);
        queue1.enqueue('k');
        queue1.enqueue('u');
        queue1.enqueue('n');
        queue1.enqueue('g');
        queue1.enqueue('f');
        queue1.enqueue('u');
        queue1.enqueue('!');        
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
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
        if(rear < array1.length - 1) {
            array1[rear++] = c;
            System.out.println("Enqueue: " + array1[rear-1]);
        } else {
            System.out.println("Not Possible");
        }
    }
    public char dequeue() {
        return array1[front++];
    }
}

