package br.edu.infnet.streaming.model.exceptions;

public class EmailIsInvalidException extends Exception {
    private static final long serialVersionUID = 1L;

    public EmailIsInvalidException(String message) {
        super(message);
    }
}
