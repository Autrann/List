package uaslp.objetos.lista;

import uaslp.objetos.lista.exception.NotNullValuesAllowedException;
import uaslp.objetos.lista.exception.NotValidIndexException;

public interface List <T> {
    void addAtTail(T data) throws NotNullValuesAllowedException;

    void addAtFront(T data) throws NotNullValuesAllowedException;

    void remove(int index) throws NotValidIndexException;

    void removeAll();

    void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException;

    T getAt(int index) throws NotValidIndexException;

    Iterator<T> getIterator();

    int getSize();
}
