package ru.netology.domain;

public class NegativeIdException extends RuntimeException {

    public NegativeIdException(int id) {
        super("Id не может быть отрицательным, а у вас: " + id);
    }

}
