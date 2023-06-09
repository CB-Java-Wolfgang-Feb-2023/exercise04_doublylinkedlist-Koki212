package unit16_230603.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer DoublyLinkedList
        MyDoublyLinkedList doubly_ll = new MyDoublyLinkedList();

        // Befüllen der LinkedList -> [6, 1, 5, 9]
        doubly_ll.insertEnd(5);
        doubly_ll.insertFront(1);
        doubly_ll.insertFront(6);
        doubly_ll.insertEnd(9);

        // Ausgabe auf Konsole
        doubly_ll.printDoublyLinkedList(doubly_ll.head);

        // Einfügen der Zahl 11 nach der HEAD-Node -> [6, 11, 1, 5, 9]
        doubly_ll.insertAfter(doubly_ll.head, 11);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);

        // Einfügen der Zahl 15 nach der zweiten Node -> [6, 11, 15, 1, 5, 9]
        doubly_ll.insertAfter(doubly_ll.head.next, 15);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);

        // Entfernen der Letzen Node (9)
        doubly_ll.deleteNode(doubly_ll.head.next.next.next.next.next);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);
    }
}
