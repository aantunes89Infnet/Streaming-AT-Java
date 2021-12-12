package br.edu.infnet.streaming.model.exceptions;

public class NameIsInvalidException extends Exception{
    private static final long serialVersionUID = 1L;

    public NameIsInvalidException(String message) {
        super(message);
    }
}

