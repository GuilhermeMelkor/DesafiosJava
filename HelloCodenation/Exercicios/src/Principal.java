public class Principal {
    public static void main(String[] args) {

        ///Multiplos de 3
        //for (int num = 3; num <= 100; num+=3) {System.out.println(num);}

        
        int fatorial =1;
        System.out.println(fatorial);
        for (int n = 1; n <=10; n++){
           fatorial *=n;
           System.out.println("Fatorial de " + n + " = " +fatorial);
        }
    }
}
