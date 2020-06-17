package br.com.codenation;
import java.util.Arrays;
public class StatisticUtil {

	public static int average(int[] elements) {
		int soma= 0;
		if (elements != null && elements.length > 0){
			Arrays.sort(elements);
			for (int i =0 ; i < elements.length; i++){
				soma += elements[i];
			}
		}
		return soma/elements.length;
	}
	
	public static int mode(int[] elements) {
		int[] mode = elements;
		

		int nVezes = 0;
		int moda = 0;
		int qtdVezes = 0;
		for (int i = 0; i < mode.length; i++) {

			nVezes = 0;
			for (int j = i + 1; j < mode.length; j++) {
				if (mode[i] == mode[j]) {
					++nVezes;
				}
			}
			if (nVezes > qtdVezes) {
				moda = mode[i];
				qtdVezes = nVezes;
			}
		}
		return moda;

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