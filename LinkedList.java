class LinkedList {
    public static void main(String args[]) {
        Node n1 = new Node("Radha");
        Node n2 = new Node("Krishna");
        Node n3 = new Node("Vasudev");
        n1.next = n2;
        n2.next = n3;
        printLinketList(n1);
        String[] stringArray = {"Make", "Way", "For", "Noddy","oswald","pokemon","beyblade","digimon","transformers"};
        Node defaultLinkedList = convertStringArrayToNode2(stringArray);
        printLinketList(convertStringArrayToNode2(stringArray));
        printSelectedNode(defaultLinkedList,2);
        printLinketList(defaultLinkedList);
        removeSelectedNode(defaultLinkedList,2);
        printSelectedNode(defaultLinkedList,2);
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
        Node head = new Node(stringArray[0]);
        Node nextNode = head;

        Node newNode = new Node(stringArray[1]);
        nextNode.next = newNode;
        nextNode = newNode;
        
        Node newNewNode = new Node(stringArray[2]);
        nextNode.next = newNewNode;
        nextNode = newNewNode;
        
        Node newNewNewNode = new Node(stringArray[3]);
        nextNode.next = newNewNewNode;
        nextNode = newNewNewNode;
        
        Node newNewNewNewNode = new Node(stringArray[4]);
        nextNode.next = newNewNewNewNode;
        nextNode = newNewNewNewNode;
        
        return head;
    }
    static Node convertStringArrayToNode2(String stringArray[]) {
        Node head = new Node(stringArray[0]);
        Node nextNode = head;
        for(int i = 1; i < stringArray.length; i++) {
            Node newNode = new Node(stringArray[i]);
            nextNode.next = newNode;
            nextNode = newNode;
        }
        return head;
    }
    static void printSelectedNode(Node input, int n) {
        Node list = input;
        if(n<1) {
            System.out.println("Invalid value");
        } else {
            for(int i = 1; i < n; i++) {
                if(list.next != null) {
                    list = list.next;
                }
                else {
                    System.out.println("No Node is present");
                    return;
                }
            }
            System.out.println(list.data);
        }
    }
    static void removeSelectedNode(Node list, int n) {
        if(n<1) {
            System.out.println("Invalid value");
        } else {
            for(int i = 1; i < n; i++) {
                if(list.next != null) {
                    Node prevNode = list;
                    list = list.next;
                }
                else {
                    System.out.println("No Node is present");
                    return;
                }
            }
            System.out.println(list.data);
            System.out.println(prevNode.data);
            prevNode.next = list;
        }
    }
}

class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
    }
}
