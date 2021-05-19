package thuchanh1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0; // số phần tử
    private static final int DEFAULT_CAPACITY = 10; // số phần tử tối ta trong ds
    private Object elments[]; // mảng chứa các phần tử

    public MyList() {
        elments = new Object[10];
    }
    private void ensureCapa(){  // thay đổi số phần tử tối đa trong danh sách
        int newSize = elments.length * 2;
        elments = Arrays.copyOf(elments,newSize);
    }
    public void add(E e){
        if (size== elments.length){
            ensureCapa();
        }
        elments[size++] = e;
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elments[i];
    }
}
