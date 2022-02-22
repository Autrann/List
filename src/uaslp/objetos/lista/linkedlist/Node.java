package uaslp.objetos.lista.linkedlist;

public class Node {    //  -> Las clases solo pueden ser públicas o package-private
    String data;
    Node next;
    Node previous;

    Node(String data) {
        this.data = data;
    }
}