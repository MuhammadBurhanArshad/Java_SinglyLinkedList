public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void findPairWithSum(int sum) {
        Node first = head;
        while (first != null) {
            Node second = first.next;
            while (second != null) {
                if (first.data + second.data == sum) {
                    System.out.println("Pair found: (" + first.data + ", " + second.data + ")");
                }
                second = second.next;
            }
            first = first.next;
        }
    }

    public void insertAfter(int newData, int prevData) {
        Node temp = head;
        while (temp != null && temp.data != prevData) {
            temp = temp.next;
        }
        if (temp != null) {
            Node newNode = new Node(newData);
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Node with data " + prevData + " not found.");
        }
    }
}
