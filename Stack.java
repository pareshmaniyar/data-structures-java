class StackApplication {
    public static void main(String args[]) {
        System.out.println("Stack Implementation with arrays");
        StackArray stack1 = new StackArray(20);
        if(stack1.isEmpty())
            System.out.println("Array empty initially");
        stack1.push(1);
        stack1.push(7);
        stack1.push(2);
        stack1.push(8);
        System.out.println(stack1.pop());
        stack1.push(9);
        if(!stack1.isEmpty())
            System.out.println("Topmost Element on Stack is " + stack1.peek());
        printTheWholeStackFromTop(stack1);
        printTheWholeStackFromBottom(stack1);
        StackLinkedList stack2 = new StackLinkedList();
        stack2.push(0);
        stack2.push(1);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(5);
    }
    public static void printTheWholeStackFromTop(StackArray currentStack) {
        StackArray storage = new StackArray(currentStack.length());
        int i = 1;
        while(!currentStack.isEmpty()) {
            System.out.println("Peak from Top No." + (i++) + ": " + currentStack.peek());
            storage.push(currentStack.pop());
        }
        while(!storage.isEmpty()) {
            currentStack.push(storage.pop());
        }
    }
    public static void printTheWholeStackFromBottom(StackArray currentStack) {
        StackArray storage2 = new StackArray(currentStack.length());
        int i = 1;
        while(!currentStack.isEmpty()) {
            storage2.push(currentStack.pop());
        }
        while(!storage2.isEmpty()) {
            System.out.println("Peak from Bottom No." + (i++) + ": " + storage2.peek());
            currentStack.push(storage2.pop());
        }
    }

}
class StackArray {
    private int size;
    private int array[];
    StackArray(int size) {
        this.size = size;
        array = new int[size];
    }
    private int head = -1;
    public void push(int i) {
        if(head < 19) {
            System.out.println(array.length);
            array[++head] = i;
            System.out.println(array[++head]);
            // System.out.println("Pushed: "+array[head]);
        }
        else
            System.out.println("Stack full");
    }
    public int pop() {
        if(head == -1)
            return -1;
        // System.out.println("Pop: "+array[head]);
        return array[head--];
    }
    public boolean isEmpty() {
        return head == -1;
    }
    public int peek() {
        if(head == -1)
            return -1;
        return array[head];
    }
    public int length() {
        return head + 1;
    }
}

class StackLinkedList {
    private Node head = new Node(-1);
    private Node currentReference;
    public void push(int i) {
        if(head == null) {
            head.setData(i);
            currentReference = head;
        } else {
            while(!(currentReference.next == null)) {
                System.out.println(currentReference.getData());
                currentReference = currentReference.next;
            }
            currentReference.next = new Node(i);
        }
    }
    // public int pop(int i) {}
    // public boolean isEmpty() {}
    // public int peek() {}
}
class Node {
    private int i;
    Node next;
    public Node(int i) {
        this.i = i;
    }
    public int getData() {
        return i;
    }
    public void setData(int i) {
        this.i = i;
    } 
}
