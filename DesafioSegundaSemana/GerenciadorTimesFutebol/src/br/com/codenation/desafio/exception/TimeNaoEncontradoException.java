package br.com.codenation.desafio.exception;

public class TimeNaoEncontradoException extends Exception {
    public TimeNaoEncontradoException() {
    }

    public TimeNaoEncontradoException(String message) {
        super(message);
    }

    public TimeNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeNaoEncontradoException(Throwable cause) {
        super(cause);
    }

    public TimeNaoEncontradoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
