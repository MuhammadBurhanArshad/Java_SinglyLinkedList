public class StackUsingSinglyLinkedList {
    private SinglyLinkedList list;

    public StackUsingSinglyLinkedList() {
        list = new SinglyLinkedList();
    }

    public void push(int data) {
        list.insert(data);
    }

    public void pop() {
        if (list.head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = list.head;
        if (temp.next == null) {
            list.head = null;
        } else {
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void printStack() {
        list.printList();
    }
}
