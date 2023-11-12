public class DoublyLinkedListCustom implements MyListInterface {
    Node head;
    Node tail;
    int size;

    //TODO implement methods


    // Methode zum Ermitteln des TAIL
    public void getTail() {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node tail = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // die DoublyLinkedList traversieren
        while (tail.next != null) {
            tail = tail.next;
        }
        // den TAIL zurückgeben
        this.tail = tail;
    }

    // Methode für das Einfügen am ANFANG der DoublyLinkedList
    @Override
    public void addFirst(int item) {
        // Kreierung einer Node
        Node newNode = new Node(item);
        // die neu-kreierte Node zum HEAD machen
        newNode.next = head;
        // den PREVIOUS der neuen Node auf NULL setzen
        newNode.previous = null;
        // den HEAD der neuen Node zuweisen
        if (head != null) {
            head.previous = newNode;
        }
        // HEAD zeigt an die neue Node
        head = newNode;
        size++;
        getTail();
    }

    // Methode für das Einfügen am ENDE der DoublyLinkedList
    @Override
    public void addLast(int item) {
        // Kreierung einer Node
        Node newNode = new Node(item);
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Das NEXT der neuen Node auf NULL setzen
        newNode.next = null;
        // Wenn die DoublyLinkedList leer ist, die NEUE Node zur HEAD-Node machen
        if (isEmpty()) {
            //den PREVIOUS-Zeiger auf NULL setzen
            newNode.previous = null;
            //die neue Node als HEAD setzen
            head = newNode;
            return;
        }
        // wenn die DoublyLinkedList nicht leer is, zum Ende der DoublyLinkedList iterieren
        while (temp.next != null) {
            temp = temp.next;
        }
        // das NEXT der letzten Node auf die neue Node setzen
        temp.next = newNode;
        // das PREVIOUS der neuen Node auf die vorherige Node setzen
        newNode.previous = temp;
        size++;
        getTail();
    }

    // Methode für das Einfügen zwischen den Nodes der DoublyLinkedList
    @Override
    public void addAtIndex(int index, int item) {
        // Kreierung einer Node
        Node newNode = new Node(item);
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn der Index 0 ist, die neue Node am Anfang der DoublyLinkedList einfügen
        if (index == 0) {
            addFirst(item);
            return;
        }
        // Wenn der Index größer als 0 ist, die DoublyLinkedList iterieren
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        // Wenn der Index größer als die DoublyLinkedList ist, die neue Node am Ende der DoublyLinkedList einfügen
        if (temp == null) {
            addLast(item);
            return;
        }
        // das NEXT der neuen Node auf das NEXT der vorherigen Node setzen
        newNode.next = temp.next;
        // das NEXT der vorherigen Node auf die neue Node setzen
        temp.next = newNode;
        // das PREVIOUS der neuen Node auf die vorherige Node setzen
        newNode.previous = temp;
        // das PREVIOUS der Node, welche nach der neuen Node kommt, auf die neue Node setzen
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        }
        size++;
        getTail();
    }

    // Methode für das Einfügen an einer zufälligen Stelle der DoublyLinkedList
    @Override
    public void addElementAtRandomIndex(int value) {
        // Kreierung einer Node
        Node newNode = new Node(value);
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Generierung einer zufälligen Zahl zwischen 0 und der DoublyLinkedList-Größe
        int randomIndex = (int) (Math.random() * (getSize() + 1));
        // Wenn der Index 0 ist, die neue Node am Anfang der DoublyLinkedList einfügen
        if (randomIndex == 0) {
            addFirst(value);
            return;
        }
        // Wenn der Index größer als 0 ist, die DoublyLinkedList iterieren
        for (int i = 0; temp != null && i < randomIndex - 1; i++) {
            temp = temp.next;
        }
        // Wenn der Index größer als die DoublyLinkedList ist, die neue Node am Ende der DoublyLinkedList einfügen
        if (temp == null) {
            addLast(value);
            return;
        }
        // das NEXT der neuen Node auf das NEXT der vorherigen Node setzen
        newNode.next = temp.next;
        // das NEXT der vorherigen Node auf die neue Node setzen
        temp.next = newNode;
        // das PREVIOUS der neuen Node auf die vorherige Node setzen
        newNode.previous = temp;
        // das PREVIOUS der Node, welche nach der neuen Node kommt, auf die neue Node setzen
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        }
        size++;
        getTail();
    }

    // Methode zum Entfernen der ersten Node der DoublyLinkedList
    @Override
    public Node removeFirst() {
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // die HEAD-Node auf die nächste Node setzen
        head = head.next;
        // die nächste Node auf NULL setzen
        head.previous = null;
        // die DoublyLinkedList-Größe um 1 verringern
        size--;
        // die entfernte Node zurückgeben
        return temp;
    }

    // Methode zum Entfernen der letzten Node der DoublyLinkedList
    @Override
    public Node removeLast() {
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // die vorletzte Node finden
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // die letzte Node finden
        Node lastNode = temp.next;
        // die vorletzte Node auf NULL setzen
        temp.next = null;
        // die DoublyLinkedList-Größe um 1 verringern
        size--;
        getTail();
        // die entfernte Node zurückgeben
        return lastNode;
    }

    // Methode zum Entfernen einer Node an einem bestimmten Stelle der DoublyLinkedList
    @Override
    public Node removeAtIndex(int index) {
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn der Index 0 ist, die erste Node entfernen
        if (index == 0) {
            removeFirst();
            return temp;
        }
        // Wenn der Index größer als 0 ist, durch die DoublyLinkedList iterieren
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        // Wenn der Index größer als die DoublyLinkedList ist, die letzte Node entfernen
        if (temp == null || temp.next == null) {
            removeLast();
            return temp;
        }
        // die zu entfernende Node finden
        Node removeNode = temp;
        // die vorherige Node auf die nächste Node setzen
        temp.next = temp.next.next;
        // die nächste Node auf die vorherige Node setzen
        temp.next.previous = temp;
        // die DoublyLinkedList-Größe um 1 verringern
        size--;
        getTail();
        // die entfernte Node zurückgeben
        return removeNode;
    }

    // Methode zum Ausgeben der Größe der DoublyLinkedList
    @Override
    public int getSize() {
        return size;
    }

    // Methode zum Überprüfen, ob die DoublyLinkedList leer ist
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // Methode zum printen der DoublyLinkedList
    @Override
    public void printList() {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // die DoublyLinkedList iterieren und die Werte der Nodes ausgeben
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Methode zum printen der DoublyLinkedList rückwärts
    @Override
    public void printListBackwards() {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // die letzte Node finden
        while (temp.next != null) {
            temp = temp.next;
        }
        // die DoublyLinkedList iterieren und die Werte der Nodes ausgeben
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.previous;
        }
        System.out.println();
    }

    // Exception für den Fall, dass der Index nicht existiert
    @Override
    public int get(int index) throws IllegalArgumentException {
        // Wenn der Index kleiner als 0 ist oder größer als die DoublyLinkedList ist, Exception werfen
        if (index < 0 || index > getSize()) {
            throw new IllegalArgumentException("Index does not exist");
        }
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn der Index 0 ist, den Wert der ersten Node zurückgeben
        if (index == 0) {
            return temp.value;
        }
        // Wenn der Index größer als 0 ist, die DoublyLinkedList iterieren
        for (int i = 0; temp != null && i < index; i++) {
            temp = temp.next;
        }
        // den Wert der Node an der Stelle des Index zurückgeben
        return temp.value;
    }

    // Methode zum Entfernen von doppelten Nodes
    @Override
    public void removeDuplicates() {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        while (temp != null) {
            // die nächste Node finden
            Node nextNode = temp.next;
            // durch die DoublyLinkedList iterieren
            while (nextNode != null) {
                // Wenn der Wert der nächsten Node dem Wert der aktuellen Node entspricht
                if (nextNode.value == temp.value) {
                    // die nächste Node entfernen
                    nextNode.getPrevious().setNext(nextNode.getNext());
                    // die vorherige Node auf die nächste Node setzen
                    if (nextNode.getNext() != null) {
                        // die nächste Node auf die vorherige Node setzen
                        nextNode.getNext().setPrevious(nextNode.getPrevious());
                    } else {
                        // den TAIL auf die vorherige Node setzen
                        tail = nextNode.getPrevious();
                    }
                    // die DoublyLinkedList-Größe um 1 verringern
                    size--;
                }
                // die nächste Node zur aktuellen Node machen
                nextNode = nextNode.getNext();
            }
            // die nächste Node zur aktuellen Node machen
            temp = temp.getNext();
        }
    }

    // Methode zum Umkehren der DoublyLinkedList
    @Override
    public void reverseList() {
        Node temp;
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node currentHead = head;
        // den TAIL auf die HEAD-Node (ersten Node) setzen
        tail = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // durch die DoublyLinkedList iterieren
        while (currentHead != null) {
            // dem temporären Node den PREVIOUS der aktuellen Node zuweisen
            temp = currentHead.getPrevious();
            // dem PREVIOUS der aktuellen Node das NEXT der aktuellen Node zuweisen
            currentHead.setPrevious(currentHead.getNext());
            // dem NEXT der aktuellen Node den temporären Node zuweisen
            currentHead.setNext(temp);
            head = currentHead;
            // den PREVIOUS der aktuellen Node zur aktuellen Node machen
            currentHead = currentHead.getPrevious();
        }
    }

    // Methode zum Kopieren der DoublyLinkedList
    @Override
    public DoublyLinkedListCustom copyList() {
        // Kreierung einer neuen DoublyLinkedList
        DoublyLinkedListCustom copyList = new DoublyLinkedListCustom();
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn die DoublyLinkedList leer ist
        if (isEmpty()) {
            System.out.print("List is empty");
        }
        // die DoublyLinkedList iterieren
        while (temp != null) {
            // die DoublyLinkedList kopieren
            copyList.addLast(temp.value);
            // die nächste Node zur aktuellen Node machen
            temp = temp.next;
        }
        // die kopierte DoublyLinkedList zurückgeben
        return copyList;
    }

    // Methode zum Leeren der DoublyLinkedList
    @Override
    public void clear() {
        // die DoublyLinkedList leeren
        head = null;
        // die DoublyLinkedList-Größe auf 0 setzen
        size = 0;
    }

    // Methode zum Einfügen einer neuen Node nach einer bestimmten Node
    @Override
    public boolean insertAfter(int key, int data) {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Kreierung einer Node
        Node newNode = new Node(data);
        // Wenn die DoublyLinkedList leer ist, nichts tun
        if (head == null) {
            return false;
        }
        // die DoublyLinkedList iterieren
        while (temp != null) {
            // Wenn der Wert der aktuellen Node dem gesuchten Wert entspricht
            if (temp.value == key) {
                // das NEXT der neuen Node auf das NEXT der vorherigen Node setzen
                newNode.next = temp.next;
                // das NEXT der vorherigen Node auf die neue Node setzen
                temp.next = newNode;
                // das PREVIOUS der neuen Node auf die vorherige Node setzen
                newNode.previous = temp;
                // das PREVIOUS der Node, welche nach der neuen Node kommt, auf die neue Node setzen
                if (newNode.next != null) {
                    newNode.next.previous = newNode;
                }
                // die DoublyLinkedList-Größe um 1 erhöhen
                size++;
                // true zurückgeben
                return true;
            }
            // die nächste Node zur aktuellen Node machen
            temp = temp.next;
        }
        // false zurückgeben
        return false;
    }

    // Methode zum Entfernen der ersten Node mit einem bestimmten Wert
    @Override
    public Node deleteKey(int key) {
        // Zwischenablage der HEAD-Node (ersten Node) für späteren Gebrauch
        Node temp = head;
        // Wenn die DoublyLinkedList leer ist, nichts tun
        if (head == null) {
            return null;
        }
        // Wenn der Wert der ersten Node dem gesuchten Wert entspricht
        if (temp.value == key) {
            // die HEAD-Node auf die nächste Node setzen
            head = temp.next;
            // die DoublyLinkedList-Größe um 1 verringern
            size--;
            // die entfernte Node zurückgeben
            return temp;
        }
        // durch die DoublyLinkedList iterieren
        while (temp != null) {
            // Wenn der Wert der nächsten Node dem gesuchten Wert entspricht
            if (temp.next.value == key) {
                // die zu entfernende Node finden
                Node removeNode = temp.next;
                // die vorherige Node auf die nächste Node setzen
                temp.next = temp.next.next;
                // die DoublyLinkedList-Größe um 1 verringern
                size--;
                // die entfernte Node zurückgeben
                return removeNode;
            }
            // die nächste Node zur aktuellen Node machen
            temp = temp.next;
        }
        // null zurückgeben
        return null;
    }
}