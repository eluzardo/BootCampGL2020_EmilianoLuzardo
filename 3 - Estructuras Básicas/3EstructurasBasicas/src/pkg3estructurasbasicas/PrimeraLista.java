package pkg3estructurasbasicas;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");

        for (String letras : letters) {
            System.out.println(letras);
        }
        System.out.println("Cantidad de elementos " + letters.size());
        
        letters.add(0, "X");
        for (String letras : letters) {
            System.out.println(letras);
        }

    }

}
