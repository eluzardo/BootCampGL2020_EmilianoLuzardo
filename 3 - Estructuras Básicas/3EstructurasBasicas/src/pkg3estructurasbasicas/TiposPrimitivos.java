package pkg3estructurasbasicas;

public class TiposPrimitivos {

    public static void main(String[] args) {
        int myNum = 15;
        char caracter = 'a';
        boolean b = true;
        //como float da error por perdida de datos al castear
        double miFloat = 2346.2456;
        short miShort = 500;
        
        System.out.println("El valor de mi numero es " + myNum +
                           "\nEl valor de caracter es " + caracter +
                           "\nEl valor de b es " + b +
                           "\nEl valor de mifloat es " + miFloat +
                           "\nEl valor de mishort es " + miShort
        );
        
        
    }
    
}
