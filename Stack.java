class StackApplication {
    public static void main(String args[]) {
        System.out.println("Stack Implementation with arrays");
        StackArray stack1 = new StackArray();
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
    }
}
class StackArray {
    int array[] = new int[20];
    int head = -1;
    public void push(int i) {
        if(head < 20) {
            array[++head] = i;
            System.out.println("Pushed: "+array[head]);
        }
        else
            System.out.println("Stack full");
    }
    public int pop() {
        if(head == -1)
            return -1;
        System.out.println("Pop: "+array[head]);
        return array[head--];
    }
    public boolean isEmpty() {
        return head == -1;
    }
    public int peek() {
        return array[head];
    }
}

