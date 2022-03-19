package uaslp.objetos.lista.arraylist;


import uaslp.objetos.lista.Iterator;

public class ArrayListIterator <T> implements Iterator <T>{

    private ArrayList<T> arrayList;
    private int currentItem;

    public ArrayListIterator(ArrayList<T> arrayList) {
        this.arrayList = arrayList;

    }

        public boolean hasNext () {
            return currentItem < arrayList.getSize();
        }

        public T next () {
            T data = arrayList.getAt(currentItem);

            currentItem++;

            return data;
        }

    }
