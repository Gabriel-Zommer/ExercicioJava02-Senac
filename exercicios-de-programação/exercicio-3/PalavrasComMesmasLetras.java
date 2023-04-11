import java.util.*;

public class PalavrasComMesmasLetras {
    public static void main(String[] args) {
        String[] palavras = {"amor", "roma", "carro", "arco", "mar", "maco", "casa", "saca"};
        Map<String, Set<String>> mapa = associarPalavrasComMesmasLetras(palavras);
        
        // Exibindo o resultado
        for (String palavra : mapa.keySet()) {
            System.out.println("Palavra: " + palavra);
            System.out.println("Palavras com as mesmas letras: " + mapa.get(palavra));
            System.out.println("----------------------");
        }
    }

    public static Map<String, Set<String>> associarPalavrasComMesmasLetras(String[] palavras) {
        Map<String, Set<String>> mapa = new HashMap<>();
        
        for (String palavra : palavras) {
            String chave = ordenarLetras(palavra);
            
            if (!mapa.containsKey(chave)) {
                mapa.put(chave, new HashSet<>());
            }
            
            mapa.get(chave).add(palavra);
        }
        
        return mapa;
    }

    public static String ordenarLetras(String palavra) {
        char[] letras = palavra.toCharArray();
        Arrays.sort(letras);
        return new String(letras);
    }
}
