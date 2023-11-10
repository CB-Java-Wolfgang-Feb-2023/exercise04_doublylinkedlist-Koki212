package KokisAufgabe;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer DoublyLinkedList
        MyDoublyLinkedList doubly_ll = new MyDoublyLinkedList();

        // Befüllen der LinkedList -> [6, 1, 5, 9]
        System.out.println("Befüllen der LinkedList -> [6, 1, 5, 9]");
        System.out.println("Einfügen am Ende: 5");
        doubly_ll.insertEnd(5);
        System.out.println("Einfügen am Anfang: 1");
        doubly_ll.insertFront(1);
        System.out.println("Einfügen am Anfang: 6");
        doubly_ll.insertFront(6);
        System.out.println("Einfügen am Ende: 9");
        doubly_ll.insertEnd(9);
        System.out.println();

        // Ausgabe auf Konsole
        System.out.println("Ausgabe auf Konsole");
        doubly_ll.printDoublyLinkedList(doubly_ll.head);
        System.out.println();

        // Einfügen der Zahl 11 nach der HEAD-Node -> [6, 11, 1, 5, 9]
        System.out.println("Einfügen der Zahl 11 nach der HEAD-Node -> [6, 11, 1, 5, 9]");
        doubly_ll.insertAfter(doubly_ll.head, 11);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);
        System.out.println();

        // Einfügen der Zahl 15 nach der zweiten Node -> [6, 11, 15, 1, 5, 9]
        System.out.println("Einfügen der Zahl 15 nach der zweiten Node -> [6, 11, 15, 1, 5, 9]");
        doubly_ll.insertAfter(doubly_ll.head.next, 15);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);
        System.out.println();

        // Entfernen der Letzen Node (9)
        System.out.println("Entfernen der Letzen Node (9)");
        doubly_ll.deleteNode(doubly_ll.head.next.next.next.next.next);
        doubly_ll.printDoublyLinkedList(doubly_ll.head);
    }
}
