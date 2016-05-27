package com.exception;

/**
 * Created by pc8 on 19.05.16.
 */
public class DaoException extends RuntimeException {

    public DaoException() {
    }

    public DaoException(String s) {
        super(s);
    }

    public DaoException(Throwable throwable) {
        super(throwable);
    }

    public DaoException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DaoException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

}
