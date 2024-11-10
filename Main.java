public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        int regID = 2312395;

        list.insert(regID);
        list.insert(2312396);
        list.insert(2312397);
        list.insert(2312398);
        
        System.out.println("Singly Linked List:");
        list.printList();
        
        int sum = 2312395 + 2312396;
        System.out.println("Finding pair with sum " + sum + ":");
        list.findPairWithSum(sum);

        System.out.println("Inserting 2312399 after 2312396:");
        list.insertAfter(2312399, 2312396);
        list.printList();

        StackUsingSinglyLinkedList stack = new StackUsingSinglyLinkedList();
        
        System.out.println("\nStack operations:");
        stack.push(regID);
        stack.push(2312396);
        stack.push(2312397);
        
        System.out.println("Elements in stack:");
        stack.printStack();

        stack.pop();
        System.out.println("After popping one element:");
        stack.printStack();
    }
}
