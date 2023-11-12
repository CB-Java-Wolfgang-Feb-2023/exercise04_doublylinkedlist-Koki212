public class Main {
    public static void main(String[] args) {
        DoublyLinkedListCustom list = new DoublyLinkedListCustom();
        //TODO test all methods
        // don't forget to also check the head and tail references

        System.out.println("Size of List1: " + list.getSize());
        System.out.println("Adding at first position value 1...");
        list.addFirst(1);
        System.out.println("Adding at first position value 2...");
        list.addFirst(2);
        System.out.println("Adding at first position value 3...");
        list.addFirst(3);
        System.out.println("Adding at first position value 4...");
        list.addFirst(4);
        System.out.println("Adding at last position value 5...");
        list.addLast(5);
        System.out.println();
        System.out.println("Printing list1:");
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);

        System.out.println("Adding at index 0 value 6...");
        list.addAtIndex(0, 6);
        list.printList();
        System.out.println("Adding at index 2 value 7...");
        list.addAtIndex(2, 7);
        list.printList();
        System.out.println("Adding at index 4 value 8...");
        list.addAtIndex(4, 8);
        list.printList();
        System.out.println("Adding at index 6 value 9...");
        list.addAtIndex(6, 9);
        list.printList();
        System.out.println("Adding at index 8 value 10...");
        list.addAtIndex(8, 10);
        list.printList();
        System.out.println("Printing list:");
        list.printList();
        System.out.println();

        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println("Get value on index 0: " + list.get(0));
        System.out.println("Get value on index 1: " + list.get(1));
        System.out.println("Get value on index 2: " + list.get(2));
        System.out.println("Get value on index 3: " + list.get(3));
        System.out.println("Get value on index 4: " + list.get(4));
        System.out.println("Get value on index 5: " + list.get(5));
        System.out.println();

        list.printList();
        System.out.println("Removing at index 0...");
        list.removeAtIndex(0);
        list.printList();
        System.out.println("Removing at index 5...");
        list.removeAtIndex(5);
        list.printList();
        System.out.println("Removing at index 9 (index greater than List-size → should remove last index)...");
        list.removeAtIndex(9);
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println();

        list.printList();
        System.out.println("Removing first element...");
        list.removeFirst();
        list.printList();
        System.out.println("Removing last element...");
        list.removeLast();
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println();

        list.printList();
        System.out.println("Printing list backwards...");
        list.printListBackwards();
        System.out.println();

        System.out.println("Adding at random index value 100...");
        list.addElementAtRandomIndex(100);
        list.printList();
        System.out.println("Adding at random index value 200...");
        list.addElementAtRandomIndex(200);
        list.printList();
        System.out.println("Adding at random index value 100 AGAIN...");
        list.addElementAtRandomIndex(100);
        list.printList();
        System.out.println("Adding at random index value 200 AGAIN...");
        list.addElementAtRandomIndex(200);
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println();

        System.out.println("Removing duplicates..");
        list.removeDuplicates();
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println();

        System.out.println("Reversing list...");
        list.reverseList();
        list.printList();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println();

        System.out.println("Copying list...");
        DoublyLinkedListCustom list2 = list.copyList();
        System.out.println("Printing copied List2:");
        list2.printList();
        System.out.println("Size: " + list2.getSize());
        System.out.println("Head: " + list2.head.value);
        System.out.println("Tail: " + list2.tail.value);
        System.out.println();

        System.out.println("Clearing List2...");
        list2.clear();
        System.out.println("Printing cleared List2:");
        list2.printList();
        System.out.println("Size: " + list2.getSize());
        System.out.println();

        System.out.println("Adding at first position value 1...");
        list2.addFirst(1);
        System.out.println("Adding at first position value 2...");
        list2.addFirst(2);
        System.out.println("Adding at first position value 3...");
        list2.addFirst(3);
        System.out.println("Printing List2:");
        list2.printList();
        System.out.println("Size: " + list2.getSize());
        System.out.println("Head: " + list2.head.value);
        System.out.println("Tail: " + list2.tail.value);
        System.out.println();

        System.out.println("Inserting after Position 2 value 4:");
        list2.insertAfter(2, 4);
        System.out.println("Printing List2:");
        list2.printList();
        System.out.println("Size: " + list2.getSize());
        System.out.println("Head: " + list2.head.value);
        System.out.println("Tail: " + list2.tail.value);
        System.out.println();

        System.out.println("Deleting key 4...");
        list2.deleteKey(4);
        System.out.println("Size: " + list2.getSize());
        System.out.println("Head: " + list2.head.value);
        System.out.println("Tail: " + list2.tail.value);
        list2.printList();
    }
}