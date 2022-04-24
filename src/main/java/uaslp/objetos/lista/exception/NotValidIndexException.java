package uaslp.objetos.lista.exception;

public class NotValidIndexException extends Exception {

    public NotValidIndexException(int wrongIndex) {
        super("Index" + wrongIndex + " 1s out of bounds");
    }
}
