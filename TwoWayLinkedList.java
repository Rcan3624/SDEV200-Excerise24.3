import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TwoWayLinkedList implements MyList {

    public void add(int index, Object o) {

    }

    public Object get(int index) {
        return null;
    }

    public int indexOf(Object e) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public Object remove(int index) {
        return null;
    }

    public Object set(int index, Object o) {
        return null;
    }

    public boolean add(Object o) {
        return MyList.super.add(o);
    }

    public boolean isEmpty() {
        return MyList.super.isEmpty();
    }

    public boolean remove(Object e) {
        return MyList.super.remove(e);
    }

    public boolean containsAll(Collection c) {
        return MyList.super.containsAll(c);
    }

    public boolean addAll(Collection c) {
        return MyList.super.addAll(c);
    }

    public boolean removeIf(Predicate filter) {
        return MyList.super.removeIf(filter);
    }

    public Object[] toArray() {
        return MyList.super.toArray();
    }

    public Object[] toArray(IntFunction generator) {
        return MyList.super.toArray(generator);
    }

    public Object[] toArray(Object[] array) {
        return MyList.super.toArray(array);
    }

    public boolean retainAll(Collection c) {
        return MyList.super.retainAll(c);
    }

    public boolean removeAll(Collection c) {
        return MyList.super.removeAll(c);
    }

    public int size() {
        return 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public void forEach(Consumer action) {
        MyList.super.forEach(action);
    }

    public void clear() {

    }

    public Spliterator spliterator() {
        return MyList.super.spliterator();
    }

    public Stream stream() {
        return MyList.super.stream();
    }

    public Stream parallelStream() {
        return MyList.super.parallelStream();
    }
}
