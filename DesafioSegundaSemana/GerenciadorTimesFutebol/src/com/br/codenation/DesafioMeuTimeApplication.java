package com.br.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;
import br.com.codenation.desafio.exception.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exception.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exception.TimeNaoEncontradoException;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

    public List<Time> times = new ArrayList<>();
    public List<Jogador> jogadores = new ArrayList<>();


    @Desafio("incluirTime")
    public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) throws IdentificadorUtilizadoException {
        if (id == null) {
            throw new NullPointerException("Campo Id é obrigatorio");
        }
        if (nome == null) {
            throw new NullPointerException("Campo Nome é obrigatorio");
        }
        if (dataCriacao == null) {
            throw new NullPointerException("Campo Data de Criação é obrigatorio");
        }
        if (corUniformePrincipal == null) {
            throw new NullPointerException("Campo Cor de Uniforme Principal é obrigatorio");
        }
        if (corUniformeSecundario == null) {
            throw new NullPointerException("Campo Cor de Uniforme Secundario é obrigatorio");
        }
        if (times != null && !times.isEmpty()){
            if (Buscar(times,id)) {
                throw new IdentificadorUtilizadoException();
            }else{
                times.add(new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario));
            }
        }else{
            times.add(new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario));
        }

    }

    @Desafio("incluirJogador")
    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) throws IdentificadorUtilizadoException, TimeNaoEncontradoException {
        if (id == null) {
            throw new NullPointerException("Campo Id é obrigatorio");
        }
        if (idTime == null) {
            throw new NullPointerException("Campo IdTime é obrigatorio");
        }
        if (nome == null) {
            throw new NullPointerException("Campo Nome é obrigatorio");
        }
        if (dataNascimento == null) {
            throw new NullPointerException("Campo Data de Nascimento é obrigatorio");
        }
        if (nivelHabilidade == null) {
            throw new NullPointerException("Campo Nivel de Habilidade é obrigatorio");
        }
        if (salario == null) {
            throw new NullPointerException("Campo Salario é obrigatorio");
        }

        if (jogadores.contains(id)) {
            throw new IdentificadorUtilizadoException();
        } else {
            if (Buscar(times,idTime)){
                jogadores.add(new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario));
            }else{
                throw new TimeNaoEncontradoException();
            }
        }
    }

    public boolean Buscar(List arrayList, long id){
       for (int i = 0; i <= arrayList.size(); i++){
           if (((Time) arrayList.get(i)).id == id){
                return true;
           }
       }
       return false;
    }

    @Desafio("definirCapitao")
    public void definirCapitao(Long idJogador) throws JogadorNaoEncontradoException {
        if (idJogador != null){
            if (Buscar(jogadores,idJogador)){
                for (Time time: times) {
                    time.IdJogCapitao = idJogador;
                }
            }else{
                throw new JogadorNaoEncontradoException();
            }
        }
        else{
            throw new NullPointerException();
        }
    }

    @Desafio("buscarCapitaoDoTime")
    public Long buscarCapitaoDoTime(Long idTime) {
        if(idTime == null){
            for (int i = 0; i <= times.size(); i++){
                if (((Time) times.get(i)).id == idTime){
                    return times.get(i).IdJogCapitao;
                }
            }
        }else{
            throw new NullPointerException();
        }
        return (long) 0;
    }

    @Desafio("buscarNomeJogador")
    public String buscarNomeJogador(Long idJogador) throws JogadorNaoEncontradoException {
        if (idJogador != null){
            if (Buscar(jogadores,idJogador)){
                for (Jogador jogador:jogadores) {
                    if (jogador.id == idJogador){
                        return jogador.nome;
                    }
                }
            }
            else{
                throw new JogadorNaoEncontradoException();
            }
        }

            return "jogador não informado";

    }

    @Desafio("buscarNomeTime")
    public String buscarNomeTime(Long idTime) throws TimeNaoEncontradoException {
        if (idTime != null){
            if (Buscar(times,idTime)){
                for (Time time:times) {
                    if (time.id == idTime){
                        return time.nome;
                    }
                }
            }
            else{
                throw new TimeNaoEncontradoException();
            }
        }
        return "Time não informado";
    }

    @Desafio("buscarJogadoresDoTime")
    public List<Long> buscarJogadoresDoTime(Long idTime) throws TimeNaoEncontradoException {
        List<Long> retJogadores = new ArrayList<>();
        if (idTime != null){
           if(Buscar(times,idTime)){
               for (Jogador jogador:jogadores) {
                   if (jogador.idTime == idTime){
                       retJogadores.add(jogador.id);
                   }
               }
           }else{
               throw new TimeNaoEncontradoException();
           }
        }
        return retJogadores;
    }

    @Desafio("buscarMelhorJogadorDoTime")
    public Long buscarMelhorJogadorDoTime(Long idTime) throws TimeNaoEncontradoException {
        Long melhorJogador= null;
        Jogador j1 = null;
        if (idTime != null){
            if (Buscar(times,idTime)){
                List<Jogador> jogadoresTime = new ArrayList<>();
                for (Jogador jogador:jogadores) {
                    if (jogador.idTime == idTime){
                        jogadoresTime.add(jogador);
                    }
                }

                for (Jogador jog: jogadoresTime) {
                    if (j1==null){
                        j1 =jog;
                    }else{
                        if (j1.nivelHabilidade < jog.nivelHabilidade){
                            j1=jog;
                        }
                    }

                }
                melhorJogador = j1.id;
            }
            else{
                throw new TimeNaoEncontradoException();
            }
        }
        return melhorJogador ;
    }

    @Desafio("buscarJogadorMaisVelho")
    public Long buscarJogadorMaisVelho(Long idTime) throws TimeNaoEncontradoException {
        Long melhorJogador= null;
        Jogador j1 = null;
        if (idTime != null){
            if (Buscar(times,idTime)){
                List<Jogador> jogadoresTime = new ArrayList<>();
                for (Jogador jogador:jogadores) {
                    if (jogador.idTime == idTime){
                        jogadoresTime.add(jogador);
                    }
                }

                for (Jogador jog: jogadoresTime) {
                    if (j1==null){
                        j1 =jog;
                    }else{
                        if (j1.dataNascimento.isBefore(jog.dataNascimento)){
                            j1=jog;
                        }
                    }

                }
                melhorJogador = j1.id;
            }
            else{
                throw new TimeNaoEncontradoException();
            }
        }
        return melhorJogador ;
    }

    @Desafio("buscarTimes")
    public List<Long> buscarTimes() {
        if(times.size() != 0) {
            List<Long> listaTimes = new ArrayList<>();

            for(Time time: times) {
                listaTimes.add(time.id);
            }
            listaTimes.sort(null);
            return listaTimes;
        } else {
            return new ArrayList<>();
        }
    }

    @Desafio("buscarJogadorMaiorSalario")
    public Long buscarJogadorMaiorSalario(Long idTime) throws TimeNaoEncontradoException {
        Long SalMaiorJogador= null;
        Jogador j1 = null;
        if (idTime != null){
            if (Buscar(times,idTime)){
                List<Jogador> jogadoresTime = new ArrayList<>();
                for (Jogador jogador:jogadores) {
                    if (jogador.idTime == idTime){
                        jogadoresTime.add(jogador);
                    }
                }

                for (Jogador jog: jogadoresTime) {
                    if (j1==null){
                        j1 =jog;
                    }else{
                        if (j1.salario.doubleValue() < jog.salario.doubleValue()){
                            j1=jog;
                        }
                    }

                }
                SalMaiorJogador = j1.id;
            }
            else{
                throw new TimeNaoEncontradoException();
            }
        }
        return SalMaiorJogador ;
    }

    @Desafio("buscarSalarioDoJogador")
    public BigDecimal buscarSalarioDoJogador(Long idJogador) throws JogadorNaoEncontradoException {

        if (Buscar(jogadores,idJogador)){
            for (Jogador jogador: jogadores) {
                if (jogador.id==idJogador){
                    return jogador.salario;
                }
            }
        }else{
            throw new JogadorNaoEncontradoException();
        }
        return  null;
    }

    @Desafio("buscarTopJogadores")
    public List<Long> buscarTopJogadores(Integer top) {
        if(jogadores.size() != 0) {
            List<Long> TopList = new ArrayList<>();

            for(Time time: times) {
                TopList.add(time.id);
            }
            TopList.sort(null);
            return TopList;
        } else {
            return new ArrayList<>();
        }
    }

    @Desafio("buscarCorCamisaTimeDeFora")
    public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) throws TimeNaoEncontradoException {
        Time timeCasa = buscarTimePorId(timeDaCasa);
        Time timeFora = buscarTimePorId(timeDeFora);

        if(timeCasa.corUniformePrincipal.equals(timeFora.corUniformePrincipal)) {
            return timeFora.corUniformeSecundario;
        } else {
            return timeFora.corUniformePrincipal;
        }
    }
    public Time buscarTimePorId(Long timeId) throws TimeNaoEncontradoException {
        for (Time time: times) {
            if(time.id.equals(timeId)){
                return time;
            }
        }
        throw new TimeNaoEncontradoException();
    }
}
