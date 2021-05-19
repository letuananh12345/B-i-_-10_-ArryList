package baitap1;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[10];
    }

    public MyList(int capacity) {
       elements = new Object[capacity];
       this.size=capacity;
    }


    private void ensureCapa() {
        if (size>elements.length) {
            int newSize = size * 2 + 1;
            elements = Arrays.copyOf(elements,newSize);
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }

    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
               elements[i + 1] = elements[i];
            }
           elements[index] = e;
            return true;
        }
        return false;
    }



    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (Object x : elements ) {
            clone.add((E) x);
        }
        return clone;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
        }
        return null;
    }
    public boolean contains(E e) {
        for (Object a : elements)
            if (e.equals(a)) {
                return true;
            }
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }


    public void clear() {
        elements=  new Object[DEFAULT_CAPACITY];
        size = 0;
    }


}