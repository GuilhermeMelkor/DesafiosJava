import java.lang.reflect.Array;
import java.util.Arrays;

public class StatisticUtil {
public static void main(String[] args) {
    int average= StatisticUtil.average(new int[] {1,2,3,4,5});
    int mode= StatisticUtil.mode(new int[] {1,2,3,3});
    int median= StatisticUtil.median(new int[] {1,2,3,4,5,6});

    //System.out.println(average);
    System.out.println(mode);
    //System.out.println(median);
}
    public static int average(int[] elements) {
        int soma= 0;
        if (elements != null && elements.length > 0){
            for (int i =0 ; i < elements.length; i++){
                soma += elements[i];
            }
        }
        return soma/elements.length;
    }

    public static int mode(int[] elements) {
        if (elements != null && elements.length > 0){
            Arrays.sort(elements);

            int[] mode = elements;

            int qtdVezes = 0;
            int moda=0;
            for (int i=0; i < elements.length; i++){
                int nVezes = 0;
                for (int j =i + 1; j < mode.length; j++){
                    if(elements[i]==mode[j]){
                        nVezes++;
                    }
                }
                if (nVezes > qtdVezes) {
                    moda = mode[i];
                    qtdVezes = nVezes;
                }
            }
            return moda;
        }
        return 0;
    }

    public static int median(int[] elements) {
        if (elements != null && elements.length > 0){
            Arrays.sort(elements);
            int esq=0;
            int dir=elements.length-1;
            int meio;
            meio=(esq+dir)/2;
            if (elements.length % 2 == 0){
                return (elements[meio]+elements[meio+1])/2;
            }
            return elements[meio];}
        return 0;
    }
}
