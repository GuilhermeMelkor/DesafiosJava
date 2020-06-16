import br.com.codenation.desafio.exception.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exception.TimeNaoEncontradoException;
import com.br.codenation.DesafioMeuTimeApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) throws IdentificadorUtilizadoException, TimeNaoEncontradoException {
        DesafioMeuTimeApplication desafioMeuTimeApplication = new DesafioMeuTimeApplication();
        BigDecimal salario = new BigDecimal(10000);
        desafioMeuTimeApplication.incluirTime((long) 1,"Time1", LocalDate.now(),"red","blue");
        desafioMeuTimeApplication.incluirJogador((long) 10, (long) 1,"j1",LocalDate.now(),8,salario);

    }
}
