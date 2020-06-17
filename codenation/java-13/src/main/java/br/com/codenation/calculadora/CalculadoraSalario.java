package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if (salarioBase <= 1039){
            return 0;
        }else{
         return Math.round(calcINSS(salarioBase));
        }
	}
	
	
	public static int calcINSS(double SalarioBruto) {
        if (SalarioBruto <= 1500) {
            SalarioBruto-=(SalarioBruto * 0.08);
        }else if (SalarioBruto >1500 && SalarioBruto <= 4000){
            SalarioBruto -=(SalarioBruto * 0.09);
        }else if (SalarioBruto > 4000){
            SalarioBruto -=(SalarioBruto * 0.11);
        }

        if (SalarioBruto <= 3000){
            return (int) Math.round(SalarioBruto);
        }else{
            return calcIRRF(SalarioBruto);
        }
    }

    public static int calcIRRF(double salarioBruto) {
        if (salarioBruto >3000 && salarioBruto <= 6000){
            salarioBruto -= (salarioBruto * 0.075);
        }else if (salarioBruto > 6000){
            salarioBruto -= (salarioBruto * 0.15);
        }

        return (int) Math.round(salarioBruto);
    }


}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/