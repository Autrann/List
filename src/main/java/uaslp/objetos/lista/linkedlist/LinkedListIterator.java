package uaslp.objetos.lista.linkedlist;

import uaslp.objetos.lista.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    private Node<T> currentNode;

    LinkedListIterator(Node<T> startNode) {
        currentNode = startNode;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public T next() {
        T data = currentNode.data;

        currentNode = currentNode.next;

        return data;
    }
}