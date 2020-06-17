package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
            validaTexto(texto);
            texto = texto.toLowerCase();
            int deslocamento = 3;
            int pos =0;
            String MensCifrada= new String();
            for (int i =0; i < texto.length();i++){
                char c = texto.charAt(i);
                int n = (int) c;
                if (n >= 97 && n <= 122){
                    pos = n+deslocamento;
                    if (pos > 122 ){
                        pos = 96 + (pos - 122);
                    }
                }else{
                    pos = n;
                }
                MensCifrada += (char) pos;
            }
            return MensCifrada;
    }

    @Override
    public String descriptografar(String texto) {
            validaTexto(texto);
            texto = texto.toLowerCase();
            int deslocamento = 3;
            int pos =0;
            String MensCifrada= new String();
            for (int i =0; i < texto.length();i++){
                char c = texto.charAt(i);
                int n = (int) c;
                if (n >= 97 && n <= 122){
                    pos = n-deslocamento;
                    if (pos > 122 ){
                        pos = 96 + (pos - 122);
                    }
                }else{
                    pos = n;
                }
                MensCifrada += (char) pos;
            }
            return MensCifrada;
    }

    public static void validaTexto(String texto) {
        if(texto == null) throw new NullPointerException();
    	if(texto == "") throw new IllegalArgumentException();
    }
}
