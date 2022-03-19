package uaslp.objetos.lista;

import uaslp.objetos.lista.linkedlist.LinkedListIterator;
import uaslp.objetos.lista.linkedlist.Node;

public interface List <T> {
    void addAtTail(T data);

    void addAtFront(T data);

    void remove(int index);

    void removeAll();

    void setAt(int index, T data);

    T getAt(int index);

    Iterator<T> getIterator();

    int getSize();


}
