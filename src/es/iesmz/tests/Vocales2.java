package es.iesmz.tests;

import java.util.ArrayList;

public class Vocales2 {

    public static String sinVocales(String cadena){
        String cadenaSinVocales="";
        char letraCadena;
        ArrayList<String> letras = new ArrayList<>();
        for(int i=0; i<cadena.length(); i++){
            letraCadena=cadena.charAt(i);
            letras.add(String.valueOf(letraCadena));
        }
        for(int j=0; j<letras.size(); j++){
            if(letras.get(j).equalsIgnoreCase("A")){
                letras.remove(j);
            } else if (letras.get(j).equalsIgnoreCase("E")) {
                letras.remove(j);
            } else if (letras.get(j).equalsIgnoreCase("I")) {
                letras.remove(j);
            } else if (letras.get(j).equalsIgnoreCase("O")) {
                letras.remove(j);
            } else if (letras.get(j).equalsIgnoreCase("U")) {
                letras.remove(j);
            }
        }
        for(String letra:letras){
            cadenaSinVocales+=letra;
        }
        return cadenaSinVocales;
    }

}
