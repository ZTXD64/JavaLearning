package Generics.o2_genericsClass;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList list = new ArrayList<>();

    public boolean add(E e) {
        list.add(e);
        return true;
    }

    public boolean remove(E e) {
        list.remove(e);
        return true;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
