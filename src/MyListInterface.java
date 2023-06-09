public interface MyListInterface {

    void addFirst(int item);

    void addLast(int item);

    void addAtIndex(int index, int item);

    void addElementAtRandomIndex(int value);

    Node removeFirst();

    Node removeLast();

    Node removeAtIndex(int index);

    int getSize();

    boolean isEmpty();

    void printList();

    void printListBackwards();

    int get(int index) throws IllegalArgumentException;

    void removeDuplicates();

    void reverseList();

    DoublyLinkedListCustom copyList();

    void clear();

    boolean insertAfter(int key, int data);


    // Removes first occurrence of element val and returns true if this was successful.
    // In error case (e.g. if the given element is not found) return false.
    Node deleteKey(int key);
}
