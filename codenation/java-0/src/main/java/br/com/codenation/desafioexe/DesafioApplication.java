package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
    public static void main(String[] args) {
        System.out.println(fibonacci());
        System.out.println(isFibonacci(2));
    }
    public static java.util.List<Integer> fibonacci() {
        List<Integer> Fib = new ArrayList<>();
        Fib.add(0);
        Fib.add(1);
        int n=0;
        for (int i = 2; n <=350; i++){
            n=Fib.get(i-1) + Fib.get(i-2);
            Fib.add(n);
        }
        return Fib;
    }

    public static boolean isFibonacci(int nfib){
        List<Integer> listFib = fibonacci();
       return listFib.contains(nfib);
    }
}
