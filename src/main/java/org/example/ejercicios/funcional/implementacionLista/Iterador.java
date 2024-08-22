package org.example.ejercicios.funcional.implementacionLista;

public class Iterador<T> {
    public DefaultMyList<T> defaultMyList;
    public boolean hasNext(){
        return defaultMyList.hasNext();
    }

    public T next(){
        this.defaultMyList = this.defaultMyList.getNext();
        return this.defaultMyList.getVal();
    }

    public Iterador(DefaultMyList<T> defaultMyList){
        this.defaultMyList = defaultMyList;
    }

}
