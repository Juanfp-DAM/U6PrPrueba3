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
}