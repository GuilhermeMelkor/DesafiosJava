package br.com.codenation.desafio.exception;

public class JogadorNaoEncontradoException  extends  Exception {
    public JogadorNaoEncontradoException() {
    }

    public JogadorNaoEncontradoException(String message) {
        super(message);
    }

    public JogadorNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }

    public JogadorNaoEncontradoException(Throwable cause) {
        super(cause);
    }

    public JogadorNaoEncontradoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
