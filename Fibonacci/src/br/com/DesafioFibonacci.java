package br.com;
import java.util.ArrayList;
import java.util.List;

public class DesafioFibonacci {
    private static List<Integer> Fib;

    public static void main(String[] args) {
        System.out.println(fibonacci());
        System.out.println(isFibonacci(4181));
    }

    private static java.util.List<Integer> fibonacci() {
        Fib = new ArrayList<>();
        Fib.add(0);
        Fib.add(1);

        for (int i = 2; i <=350; i++){
            Fib.add(Fib.get(i-1) + Fib.get(i-2));
        }
        return Fib;
    }

    private static boolean isFibonacci(int nfib){
        return Fib.contains(nfib);
    }


}
