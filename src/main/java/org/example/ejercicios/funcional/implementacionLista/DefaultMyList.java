package org.example.ejercicios.funcional.implementacionLista;

import java.util.Arrays;

public class DefaultMyList<T> implements MyList<T> {
    private DefaultMyList<T> next;
    private T val;
    private int size;

    protected boolean hasNext() {
        return next != null;
    }

    protected DefaultMyList<T> getNext() {
        return next;
    }

    protected T getVal() {
        return val;
    }

    public DefaultMyList() {
        this.size = 0;
    }

    public DefaultMyList(T t) {
        this.size = 1;
        this.val = t;
    }

    @SafeVarargs
    public DefaultMyList(T... ts) {
        if (ts.length == 0) {
            return;
        }
        if (ts.length == 1) {
            this.val = ts[0];
            this.size = 1;
        } else {
            // ToDo OPTIMIZAR ESTO PARA USAR UN SOLO ARRAY
            this.next = new DefaultMyList<T>(Arrays.copyOfRange(ts, 1, ts.length - 1));
        }
    }

    private DefaultMyList<T> getLast() {
        if (next == null) {
            return this;
        } else return this.getLast();
    }

    @Override
    public void add(T t) {
        if (size == 0) {
            this.size++;
            this.val = t;
        } else {
            this.size++;
            DefaultMyList<T> last = this.getLast();
            last.next = new DefaultMyList<T>(t);
        }
    }

    @Override
    public void clear() {
        if (hasNext()) {
            next.clear();
        }
        val = null;
    }

    @Override // TODO
    public boolean remove(T t) {
        // no hace falta recursion pero si jugar con las referencias
        // DefaultMyList<T> future

        if (this.size == 0) return false;


        // como hago!!!!!

        if (this.size == 1) { // osea que es el último
            if (this.val == t) return false;
        }



        return false;
    }


    /* // Las excepciones no están pensadas para ser usadas así
    private boolean recursiveRemove(T t) throws RemoveAndReconnectException{
        if (this.val == t){
            if (this.next == null)
                throw new RemoveAndReconnectException();
            else throw new RemoveAndReconnectException(this.next);
        }

        if (this.next != null){
            try {
                this.next.recursiveRemove(t);
            } catch (RemoveAndReconnectException e){
                this.next.val = null;
                this.next = e.defaultMyList;
            }
        }
    }

    public class RemoveAndReconnectException extends Exception{
        protected DefaultMyList<T> defaultMyList;
        public RemoveAndReconnectException(DefaultMyList<T> defaultMyList){
            super();
            this.defaultMyList = defaultMyList;

        }
        public RemoveAndReconnectException(){
            super();
        }



    }*/


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(T t) {
        if (this.val == t) {
            return true;
        } else if (this.next == null) {
            return false;
        } else {
            return this.next.contains(t);
        }
    }

    @Override
    public boolean containsAll(MyList<T> myList) {
        // TODO generar una lista que borre los duplicados


        return false;
    }
}
