package acctMgr.model;

public class OverdraftException extends Exception {
    public OverdraftException(String message) {
        super(message);
    }
}