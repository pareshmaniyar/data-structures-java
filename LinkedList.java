class LinkedList {
    public static void main(String args[]) {
        Node n1 = new Node("Radha");
        Node n2 = new Node("Krishna");
        Node n3 = new Node("Vasudev");
        n1.next = n2;
        n2.next = n3;
        printLinketList(n1);
        String[] stringArray = {"Make", "Way","For","Noddy"};
        printLinketList(convertStringArrayToNode(stringArray));
    }
    static void printLinketList(Node head){
        int count = 1;
        while(head != null) {
            System.out.println("No." + count + ": " + head.data);
            head = head.next;
            count++;
        }
    }
    static Node convertStringArrayToNode(String stringArray[]) {
        Node head = new Node();
        
        for(int i = 1; i < stringArray.length; i++){
            head.data = stringArray[i-1];
            head = head.next;
        }
        return head;
    }
}

class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
    }
}