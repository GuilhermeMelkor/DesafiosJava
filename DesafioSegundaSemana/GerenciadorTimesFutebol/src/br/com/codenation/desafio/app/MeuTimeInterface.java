
package br.com.codenation.desafio.app;

import br.com.codenation.desafio.exception.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exception.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exception.TimeNaoEncontradoException;

public abstract interface MeuTimeInterface {

    public static void incluirTime(java.lang.Long arg0, java.lang.String arg1, java.time.LocalDate arg2, java.lang.String arg3, java.lang.String arg4) throws Exception {
    }

    public static void incluirJogador(java.lang.Long arg0, java.lang.Long arg1, java.lang.String arg2, java.time.LocalDate arg3, java.lang.Integer arg4, java.math.BigDecimal arg5) throws IdentificadorUtilizadoException, TimeNaoEncontradoException {
    }

    public static void definirCapitao(java.lang.Long arg0) {
    }

    public abstract java.lang.Long buscarCapitaoDoTime(java.lang.Long arg0);

    public abstract java.lang.String buscarNomeJogador(java.lang.Long arg0) throws JogadorNaoEncontradoException;

    public abstract java.lang.String buscarNomeTime(java.lang.Long arg0) throws TimeNaoEncontradoException;

    public abstract java.lang.Long buscarJogadorMaiorSalario(java.lang.Long arg0) throws TimeNaoEncontradoException;

    public abstract java.math.BigDecimal buscarSalarioDoJogador(java.lang.Long arg0) throws JogadorNaoEncontradoException;

    public abstract  java.util.List<java.lang.Long> buscarJogadoresDoTime(java.lang.Long arg0) throws TimeNaoEncontradoException;

    public abstract java.lang.Long buscarMelhorJogadorDoTime(java.lang.Long arg0) throws TimeNaoEncontradoException;

    public abstract java.lang.Long buscarJogadorMaisVelho(java.lang.Long arg0) throws TimeNaoEncontradoException;

    public abstract  java.util.List<java.lang.Long> buscarTimes();

    public abstract  java.util.List<java.lang.Long> buscarTopJogadores(java.lang.Integer arg0);

    public abstract java.lang.String buscarCorCamisaTimeDeFora(java.lang.Long arg0, java.lang.Long arg1) throws TimeNaoEncontradoException;
}