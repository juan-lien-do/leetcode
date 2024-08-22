package org.example.ejercicios.funcional.implementacionLista;

public interface MyList<T> {
    void add(T t);

    void clear();

    boolean remove(T t);

    int size();
    boolean contains(T t);

    boolean containsAll(MyList<T> myList);
}
