package uaslp.objetos.lista.linkedlist;

public class Node <T> {    //  -> Las clases solo pueden ser públicas o package-private
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}