import challenge.Carro;
import challenge.Cor;
import challenge.Estacionamento;
import challenge.Motorista;
import static java.util.concurrent.ThreadLocalRandom.current;

public class Principal {
    public static void main(String[] args) {

        //Carro.CarroBuilder carroBuilder =  Carro.builder();
        Estacionamento estacionamento= new Estacionamento();

        Motorista ada = Motorista.builder().withNome("Ada")
                .withIdade(60)
                .withPontos(3)
                .withHabilitacao("1231")
                .build();

        Carro carroBranco = Carro.builder().withCor(Cor.BRANCO).
                withPlaca("123")
                .withMotorista(ada)
                .build();

        estacionamento.estacionar(carroBranco);

        for (int indice = 1; indice <= 10; indice++) {

            Motorista motorista = Motorista.builder()
                    .withNome("Motorista " + indice)
                    .withIdade(20)
                    .withPontos(3)
                    .withHabilitacao(Long.toString(current().nextLong()))
                    .build();

            Carro carro = Carro.builder()
                    .withCor(getCor()).
                            withPlaca("123")
                    .withMotorista(motorista)
                    .build();

            estacionamento.estacionar(carro);
        }
        System.out.println(estacionamento.carrosEstacionados());

    }
    private static Cor getCor() {
        return Cor.values()[current().nextInt(0, 2)];
    }
}

