package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @org.junit.jupiter.api.Test
    void sinVocales() {
        //ARRANGE
        String hola="Hola Mundo";
        //ACT
        String holaSinVocales=Vocales2.sinVocales(hola);
        //ASSERT
        assertEquals("Hl Mnd", holaSinVocales);
    }

    @org.junit.jupiter.api.Test
    void sinVocales2(){
        //ARRANGE
        String cadena ="Esto Es una cadenA";
        //ACT
        String cadenaSinV=Vocales2.sinVocales(cadena);
        //ASSERT
        assertEquals("st s n cdn", cadenaSinV);
    }

    @org.junit.jupiter.api.Test
    void sinVocales3(){
        //ARRANGE
        String mola = "Java mola MogollOn";
        //ACT
        String molaSinV=Vocales2.sinVocales(mola);
        //ASSERT
        assertEquals("Jv ml Mglln", molaSinV);
    }

    @org.junit.jupiter.api.Test
    void sinVocales4(){
        //ARRANGE
        String numeros="4h0r4 s0n num3r0s";
        //ACT
        String numerosSinV=Vocales2.sinVocales(numeros);
        //ASSERT
        assertEquals("4h0r4 s0n nm3r0s", numerosSinV);
    }

    @org.junit.jupiter.api.Test
    void sinVocales5(){
        //ARRANGE
        String cad="Cadena Sin Vocales";
        //ACT
        String cadSinV=Vocales2.sinVocales(cad);
        //ASSERT
        assertEquals("Cdn Sn Vcls", cadSinV);
    }
}