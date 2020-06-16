package challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estacionamento {

    private final int maxVagas = 10;

    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public void estacionar(Carro carro) {
        Motorista motorista = carro.getMotorista();
        if (motorista !=null){
            if(carrosEstacionados() >= maxVagas && carro.getMotorista().getIdade() >= 55){
                for (int i=0;i <carrosEstacionados(); i++){
                    if(carros.get(i).getMotorista().getIdade() < 55){
                        carros.remove(i);
                        carros.add(carro);
                    }
                }
                if (carrosEstacionados() == maxVagas){
                    throw new EstacionamentoException("Não é possível estacionar o carro");
                }else{
                    carros.add(carro);
                }
            }
            else if (carrosEstacionados() < maxVagas){

                carros.add(carro);

            }
        }
        else {
            throw new EstacionamentoException("Carro autonômo não autorizado!");
        }
    }

    public int carrosEstacionados() {

        return carros.size() ;
    }

    public boolean carroEstacionado(Carro carro) {
        return true;
    }
}
