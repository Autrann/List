package uaslp.objetos.lista.exception;

public class NotNullValuesAllowedException  extends Exception{

    public NotNullValuesAllowedException() {
        super("Null values are not allowed");
    }
}
