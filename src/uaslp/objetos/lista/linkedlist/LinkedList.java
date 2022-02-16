package uaslp.objetos.lista.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public int index;
    public int data;

    public void addAtTail(String data) {

    }

    public void addAtFront(String data) {
        Node node = new Node(data);

        if(size == 0) {
            head = node;
            tail = node;
        }else {
            node.next = head;
            head.previous = node;
        }

        head.previous = node;

        node.next = head;
        head.previous = node;
        head = node;
        tail = node;

        size++;

    }

    public void remove(index) {
    }

    public void removeAll() {

    }

    public void setAt(index,data) {

    }

    public String getAt(index) {
        return null;
    }

    public void getSize() {
    }

    public ListIterator getIterator() {
        return null;
    }
}

