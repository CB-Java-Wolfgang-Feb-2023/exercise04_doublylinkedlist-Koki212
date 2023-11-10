package KokisAufgabe;

public class MyDoublyLinkedList {
    Node head;

    // Methode für das Einfügen am ANFANG der LinkedList
    public void insertFront(int value) {
        // Kreierung einer Node
        Node newNode = new Node(value);

        // die neu-kreierte Node zum HEAD machen
        newNode.next = head;

        // den PREVIEW der neuen Node auf NULL setzen
        newNode.prev = null;

        // den HEAD der neuen Node zuweisen
        if (head != null) {
            head.prev = newNode;
        }

        // HEAD zeigt an die neue Node
        head = newNode;
    }

    // Methode für das Einfügen zwischen den Nodes der LinkedList
    public void insertAfter(Node prev_node, int value) {
        // Check ob die vorherige Node NULL ist
        if (prev_node == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        // Kreierung einer Node
        Node newNode = new Node(value);

        // Das NEXT der vorherigen Node auf das NEXT der neuen Node setzen
        newNode.next = prev_node.next;

        // Das NEXT der vorherigen Node auf die neue Node zuweisen
        prev_node.next = newNode;

        // Das PREV der neuen Node auf die vorherige Node zuweisen
        newNode.prev = prev_node;

        // Das PREV der Node, welche nach der neuen Node kommt, auf die neue Node zuweisen
        if (newNode.next != null) {
            newNode.prev.next = newNode;    // <- DIESE SCHREIBWEISE BITTE ERKLÄREN !!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
    }

    // Methode zum einfügen einer neuen Node am Ende der LinkedList
    public void insertEnd(int value) {
        // Kreierung einer Node
        Node newNode = new Node(value);

        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;

        // Das NEXT der neuen Node auf NULL setzen
        newNode.next = null;

        // Wenn die LinkedList leer ist, die NEUE Node zur HEAD-Node machen
        if (head == null) {
            //den PREV-Zeiger auf NULL setzen
            newNode.prev = null;
            //die neue Node als HEAD setzen
            head = newNode;
            return;
        }

        // wenn die LinkedList nicht leer is, zum Ende der LinkedList traversieren
        while (temp.next != null) {
            temp = temp.next;
        }

        // Den NEXT-Zeiger der letzten Node auf die neue Node zuweisen
        temp.next = newNode;

        // Den PREV-Zeiger der neuen Node auf die letzte Node(vor der neuen) zuweisen
        newNode.prev = temp;
    }

    // Methode zum Löschen einer beliebigen Node
    void deleteNode(Node del_node) {
        // wenn der HEAD oder die zulöschende Node NULL ist, Löschen nicht möglich
        if (head == null || del_node == null) {
            return;
        }

        // wenn du zulöschende Node die erste (Head) Node ist, den HEAD auf die nächste Node zuweisen
        if (head == del_node) {
            head = del_node.next;
        }

        // wenn die zulöschende Node NICHT die letzte Node ist
        // den PREV-Zeiger der nächsten Node, an die Node, vor der löschenden Node zuweisen
        if (del_node.next != null) {
            del_node.next.prev = del_node.prev;     // <- SCHREIBWEISE .NEXT.PREV BITTE ERKLÄREN!
        }

        // UND wenn die zulöschende Node NICHT die erste Node ist
        // den NEXT-Zeiger der vorherigen Node auf die Node, nach der zulöschenden Node zuweisen
        if (del_node.prev != null) {
            del_node.prev.next = del_node.next;
        }
    }

    // Methode zum printen der DoublyLinkedList
    public void printDoublyLinkedList(Node node) {
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " ->");
            last = node;
            node = node.next;
        }
        System.out.println();
    }

}

