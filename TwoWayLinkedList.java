import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TwoWayLinkedList<E> implements MyList<E> {
    private Node head, tail;
    private int size = 0; // Number of elements in the list

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    // Inner Node class with both next and previous pointers
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;

        public Node(E e) {
            element = e;
        }
    }

    // Constructor to create an empty list
    public TwoWayLinkedList() {
    }

    // Constructor to create a list from an array of objects
    public TwoWayLinkedList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    // Other methods (getFirst, getLast, addFirst, addLast, removeFirst, removeLast, remove, clear, contains, get, indexOf, lastIndexOf, set, iterator) remain the same as in MyLinkedList.

    // Return the number of elements in this list
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void clear() {

    }

    // Implement the listIterator() method
    @Override
    public ListIterator<E> listIterator() {
        return new TwoWayLinkedListIterator(0);
    }

    // Implement the listIterator(int index) method
    @Override
    public ListIterator<E> listIterator(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return new TwoWayLinkedListIterator(index);
    }

    // Inner class for ListIterator
    private class TwoWayLinkedListIterator implements ListIterator<E> {
        private Node<E> nextItem;
        private int nextIndex;

        public TwoWayLinkedListIterator(int index) {
            if (index < size / 2) {
                nextItem = head;
                nextIndex = 0;
                while (nextIndex < index) {
                    nextItem = nextItem.next;
                    nextIndex++;
                }
            } else {
                nextItem = tail;
                nextIndex = size - 1;
                while (nextIndex > index) {
                    nextItem = nextItem.previous;
                    nextIndex--;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E result = nextItem.element;
            nextItem = nextItem.next;
            nextIndex++;
            return result;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public E previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }

    public static void main(String[] args) {
        TwoWayLinkedList<Integer> list = new TwoWayLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Using listIterator to iterate through the list
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}