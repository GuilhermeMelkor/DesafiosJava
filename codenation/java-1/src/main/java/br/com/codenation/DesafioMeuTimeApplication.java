package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;

public class DesafioMeuTimeApplication implements MeuTimeInterface {
	
	
	public List<Jogador> jogadores = new ArrayList<>();
	public List<Time> times = new ArrayList<>();
	
	public boolean Buscar(List arrayList, long id){
		for (int i = 0; i <= arrayList.size(); i++){
			if (((Time) arrayList.get(i)).id == id){
				 return true;
			}
		}
		return false;
	 }

	@Desafio("incluirTime")
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
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
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		throw new UnsupportedOperationException();
	}

	@Desafio("definirCapitao")
	public void definirCapitao(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarCapitaoDoTime")
	public Long buscarCapitaoDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarNomeJogador")
	public String buscarNomeJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarNomeTime")
	public String buscarNomeTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarJogadoresDoTime")
	public List<Long> buscarJogadoresDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarMelhorJogadorDoTime")
	public Long buscarMelhorJogadorDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarJogadorMaisVelho")
	public Long buscarJogadorMaisVelho(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarTimes")
	public List<Long> buscarTimes() {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarJogadorMaiorSalario")
	public Long buscarJogadorMaiorSalario(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarSalarioDoJogador")
	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarTopJogadores")
	public List<Long> buscarTopJogadores(Integer top) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarCorCamisaTimeDeFora")
	public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) {
		throw new UnsupportedOperationException();
	}

}
