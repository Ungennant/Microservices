package ua.serf.microservices.bill.exception;

public class BillNotFountException extends RuntimeException {

    public BillNotFountException(String message) {
        super(message);
    }
}
