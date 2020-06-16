public class CalculadoraSalario {

    public  static void main(String[] args) {
        double salarioBruto = 4000;
        long salarioLiquido = calcularSalarioLiquido(salarioBruto);
        System.out.println(salarioLiquido);
    }

    public static long calcularSalarioLiquido(double salarioBruto) {
        if (salarioBruto <= 1039){
            return 0;
        }else{
         return Math.round(calcINSS(salarioBruto));
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
