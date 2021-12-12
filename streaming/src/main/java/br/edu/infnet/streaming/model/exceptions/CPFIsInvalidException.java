package br.edu.infnet.streaming.model.exceptions;

public class CPFIsInvalidException extends Exception {
    private static final long serialVersionUID = 1L;

    public CPFIsInvalidException(String message) {
        super(message);
    }
}
